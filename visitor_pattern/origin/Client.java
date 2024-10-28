package visitor_pattern.origin;

public class Client {

    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        //添加元素到Home对象
        home.add(new Dog());
        home.add(new Cat());

        //创建主人对象
        Owner owner = new Owner();
        //主人喂食所有宠物
        home.action(owner);
    }
}
