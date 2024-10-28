package state_pattern.after;

public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯对象
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}