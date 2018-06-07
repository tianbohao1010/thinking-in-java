package cn.hao.unit10.InnerClassAndControlFrameWork.learn;

/**
 * Created by Tianbohao on 2018/5/29.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        args = new String[]{"5000"};
        GreenhouseControls gc = new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));

        Event[] eventList = {
                gc.new LightOn(200),
                gc.new LightOff(400)
        };
        gc.addEvent(gc.new Restart(2000,eventList));

        if(args.length == 1) {
            gc.addEvent(new GreenhouseControls
                    .Terminate(new Integer(args[0])));
        }
        gc.run();
    }
}