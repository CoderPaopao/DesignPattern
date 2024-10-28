package responsibility_chain_pattern;

/**
 * 抽象处理者类
 */

public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_Three = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    protected int numStart;
    protected int numEnd;

    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请假条的方法
    protected abstract void handleLeave(LeaveRequest request);

    //提交请假条
    public final void submit(LeaveRequest request) {
        //该领导进行审批
        this.handleLeave(request);
        if (this.nextHandler != null && request.getNum() > this.numEnd) {
            //提交给上级领导进行审批
            this.nextHandler.submit(request);
        } else {
            System.out.println("流程结束！");
        }
    }

}
