package factory_pattern.simple_factory;

public class SimpleCoffeeFactory {
//    //简单工厂
//    public Coffee createCoffee(String type) {
//        Coffee coffee = null;
//        if ("american".equals(type)) {
//            coffee = new AmericanCoffee();
//        } else if ("latte".equals(type)) {
//            coffee = new LatteCoffee();
//        } else {
//            throw new RuntimeException("对不起，没有这种咖啡");
//        }
//        return coffee;
//    }
    //静态工厂
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，没有这种咖啡");
        }
        return coffee;
    }
}
