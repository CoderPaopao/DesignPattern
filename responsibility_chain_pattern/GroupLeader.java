package responsibility_chain_pattern;

/**
 * 小组长类
 */

public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        if (request.getNum() >= this.numStart && request.getNum() <= this.numEnd) {
            System.out.println(request.getName() + "请假" + request.getNum() + "天" + request.getContent());
            System.out.println("小组长审批：同意");
        } else {
            System.out.println(request.getName() + "请假" + request.getNum() + "天" + request.getContent());
            System.out.println("小组长审批：不同意，转交部门经理审批");
        }
    }
}
