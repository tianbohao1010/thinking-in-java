package cn.hao.unit21.joinAndInterrupt;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        this.duration = sleepTime;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            //异常被捕获时，总是会清理掉线程上的Interrupt的标志，所以isInterrupt()总是为假
            System.out.println(getName() + " was interrupt. " + "isInterrupted(): " + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }

}
