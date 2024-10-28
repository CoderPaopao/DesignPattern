package factory_pattern.factory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(factory);

        //点咖啡
        Coffee coffee = coffeeStore.orderCoffee();

        System.out.println(coffee.getName());
    }
}
