package cn.hao.unit21.atTemptLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Tianbohao on 2018/6/14.
 */
public class AttemptLocking {

    private ReentrantLock lock = new ReentrantLock();

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);

            System.out.println("2 SECONDS's captured is " + captured);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public void untime() {
        boolean captured = lock.tryLock();
        try {
            System.out.println("lock's captured is " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untime(); //true
        al.timed();  //true

        new Thread(){
            {setDaemon(true);}

            @Override
            public void run() {
                al.lock.lock();
                System.out.println("AttemptLocking locked!");
            }
        }.start();

        al.untime(); //false
        al.timed();  //false
    }
}
