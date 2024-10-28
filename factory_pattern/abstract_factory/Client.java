package factory_pattern.abstract_factory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();

        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
