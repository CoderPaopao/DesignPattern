package factory_pattern.abstract_factory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
