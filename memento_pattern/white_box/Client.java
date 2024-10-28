package memento_pattern.white_box;

public class Client {

    public static void main(String[] args) {
        System.out.println("------------大战boos前-------------");

        //创建游戏角色对象
        GameRule gameRule = new GameRule();
        gameRule.initState();
        gameRule.stateDisplay();

        //将该游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRule.saveState());

        System.out.println("------------大战boos后-------------");
        //损耗严重
        gameRule.fight();
        gameRule.stateDisplay();

        System.out.println("------------恢复之前的状态-------------");
        gameRule.recoverState(caretaker.getRoleStateMemento());
        gameRule.stateDisplay();

    }

}
