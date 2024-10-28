package factory_pattern.simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        Coffee coffee = factory.createCoffee(type);
        //可以直接调用静态工厂的方法
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
