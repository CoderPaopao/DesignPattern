package decorator_pattern;

public class Client {

    public static void main(String[] args) {

        System.setProperty("file.encoding", "UTF-8");

        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.getPrice() + "元");

        FastFood food1 = new FriedNoodles();
        food1 = new Egg(food1);
        System.out.println(food1.getDesc() + " " + food1.getPrice() + "元");

    }

}
