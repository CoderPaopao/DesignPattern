package responsibility_chain_pattern;

/**
 * 总经理类
 */

public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.NUM_Three,Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天" + request.getContent());
        System.out.println("总经理审批：同意");
    }

}
