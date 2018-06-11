package cn.hao.unit21.uncaughtException;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class ExceptionThread2 implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}
