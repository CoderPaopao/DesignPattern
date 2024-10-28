package responsibility_chain_pattern;

/**
 * 经理类
 */

public class Manager extends Handler{

    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_Three);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        if (request.getNum() > this.numStart && request.getNum() <= this.numEnd) {
            System.out.println(request.getName() + "请假" + request.getNum() + "天" + request.getContent());
            System.out.println("部门经理审批：同意");
        } else {
            System.out.println(request.getName() + "请假" + request.getNum() + "天" + request.getContent());
            System.out.println("部门经理审批：不同意，转交总经理审批");
        }
    }

}
