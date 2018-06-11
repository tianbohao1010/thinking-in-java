package cn.hao.unit21.uncaughtException;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught: " + e);
    }
}
