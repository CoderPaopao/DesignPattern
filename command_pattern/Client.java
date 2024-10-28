package command_pattern;

public class Client {

    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);
        order1.setFood("小杯可乐",2);

        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭",1);
        order2.setFood("小杯雪碧",1);

        //创建厨师对象
        SeniorChef seniorChef = new SeniorChef();

        //创建命令对象
        OrderCommand orderCommand1 = new OrderCommand(seniorChef, order1);
        OrderCommand orderCommand2 = new OrderCommand(seniorChef, order2);

        //创建服务员对象
        Waiter waiter = new Waiter();
        waiter.setCommand(orderCommand1);
        waiter.setCommand(orderCommand2);

        //发起命令
        waiter.orderUp();

    }

}
