package factory_pattern.before;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，没有这种咖啡");
        }
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
