package flyweight_pattern;

public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("绿色");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");

        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box4.display("蓝色");

        System.out.println(box4==box3);
    }
}
