package mediator_pattern;

public class Client {

    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediatorStructure = new MediatorStructure();

        //创建租房者对象
        Tenant tenant = new Tenant("李四", mediatorStructure);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);

        //中介要知道具体的房主和租房者
        mediatorStructure.setHouseOwner(houseOwner);
        mediatorStructure.setTenant(tenant);
        
        tenant.contact("我要租房子");
        houseOwner.contact("我有房子");
    }

}
