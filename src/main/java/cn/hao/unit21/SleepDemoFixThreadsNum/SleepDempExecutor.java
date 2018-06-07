package cn.hao.unit21.SleepDemoFixThreadsNum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Tianbohao on 2018/6/6.
 */
public class SleepDempExecutor {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 8; i++) {
            int num = (int) (Math.random() * 9) + 1;
            long time = num * 1000;
            exec.execute(new ThreadSleepDemo(time));
        }
     exec.shutdown();
    }
}
