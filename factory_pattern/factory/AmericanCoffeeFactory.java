package factory_pattern.factory;

public class AmericanCoffeeFactory implements CoffeeFactory{

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

}
