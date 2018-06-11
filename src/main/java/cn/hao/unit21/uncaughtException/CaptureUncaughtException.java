package cn.hao.unit21.uncaughtException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new HandlerThreadFactory());

        exec.execute(new ExceptionThread2());
    }
}
