package state_pattern.after;

/**
 * 环境角色类
 */

public class Context {

    //定义出所有的电梯状态
    public final static OpeningState OPENING_STATE = new OpeningState();//开门状态，这时候电梯只能关闭
    public final static ClosingState CLOSING_STATE = new ClosingState();//关闭状态，这时候电梯可以运行、停止和开门
    public final static RunningState RUNNING_STATE = new RunningState();//运行状态，这时候电梯只能停止
    public final static StoppingState STOPPING_STATE = new StoppingState();//停止状态，这时候电梯可以开门、运行

    //定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前状态对象的Context对象
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
