package cn.hao.unit21.SleepDemoFixThreadsNum;

/**
 * Created by Tianbohao on 2018/6/6.
 */
public class ThreadSleepDemo implements Runnable{

    private final int id;

    private long sleepTime;

    public static int count = 0;

    public ThreadSleepDemo(long sleepTime){
        this.sleepTime = sleepTime;

        count++;
        id = count;
    }

    public void run() {
        try {
            Thread.sleep(sleepTime);
            System.out.println("#"+id+"("+sleepTime+")");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
