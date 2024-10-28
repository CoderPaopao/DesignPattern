package factory_pattern.abstract_factory;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
