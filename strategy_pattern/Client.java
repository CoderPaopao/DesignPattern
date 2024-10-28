package strategy_pattern;

public class Client {

    public static void main(String[] args) {
        Salesman salesman = new Salesman(new StrategyA());
        salesman.salesmanShow();

        salesman.setStrategy(new StrategyB());
        salesman.salesmanShow();
    }

}
