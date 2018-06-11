package cn.hao.unit21.simpleDaemons;

import java.util.concurrent.TimeUnit;

/**
 * Created by Tianbohao on 2018/6/6.
 */
public class SimpleDaemons implements Runnable {

    public void run() {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + " " + this);
            } catch (InterruptedException e) {
                System.out.println("simpleDaemons Interrupted");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("all daemons started");
        TimeUnit.MILLISECONDS.sleep(98);
    }
}
