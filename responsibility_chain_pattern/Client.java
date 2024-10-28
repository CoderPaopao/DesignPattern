package responsibility_chain_pattern;

public class Client {

    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小米",3,"身体不适");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(request);
    }

}
