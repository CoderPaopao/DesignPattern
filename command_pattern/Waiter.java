package command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（请求者角色）
 */

public class Waiter {

    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    //发起命令
    public void orderUp() {
        System.out.println("订单来了");
        //遍历list集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }

}
