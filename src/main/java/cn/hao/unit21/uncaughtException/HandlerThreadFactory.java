package cn.hao.unit21.uncaughtException;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class HandlerThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created : " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}