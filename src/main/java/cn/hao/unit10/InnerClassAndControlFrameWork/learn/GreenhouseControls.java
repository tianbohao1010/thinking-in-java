package cn.hao.unit10.InnerClassAndControlFrameWork.learn;

/**
 * 绿房子中央控制集
 * Created by Tianbohao on 2018/5/29.
 */
public class GreenhouseControls extends Controller{
    private boolean light = false;

    /**
     * 开灯
     */
    public class LightOn extends Event{

        public LightOn(long delayTime){
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString(){
            return "Light is on";
        }
    }

    /**
     * 关灯
     */
    public class LightOff extends Event{

        public LightOff(long delayTime){
            super(delayTime);
        }

        public void action(){
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    /**
     * 响铃
     */
    public class Bell extends Event{

        public Bell(long delayTime){
            super(delayTime);
        }

        public void action(){
            addEvent(new Bell(delayTime));
        }

    }

    /**
     * 重启
     */
    public class Restart extends Event{

        private Event[] eventList;

        public Restart(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList){
                addEvent(e);
            }
        }

        public void action(){
            for (Event e : eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting system";
        }
    }

    /**
     * 关机
     */
    public static class Terminate extends Event{

        public Terminate(long delayTime){
            super(delayTime);
        }

        public void action(){
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Terminating";
        }
    }
}
