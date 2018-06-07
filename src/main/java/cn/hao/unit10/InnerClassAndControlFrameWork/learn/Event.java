package cn.hao.unit10.InnerClassAndControlFrameWork.learn;

/**
 * Created by Tianbohao on 2018/5/29.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime = delayTime;
    }

    public void start(){
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
