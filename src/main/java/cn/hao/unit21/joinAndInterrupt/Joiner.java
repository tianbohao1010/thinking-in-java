package cn.hao.unit21.joinAndInterrupt;

/**
 * Created by Tianbohao on 2018/6/11.
 */
public class Joiner extends Thread{
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper){
        super(name);
        this.sleeper = sleeper;
        start();
    }

    public void run(){
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        System.out.println(getName() + " join completed");
    }
}
