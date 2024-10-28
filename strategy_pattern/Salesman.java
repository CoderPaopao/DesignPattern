package strategy_pattern;

/**
 * 环境类
 */

public class Salesman {

    //聚合策略类对象
    private Strategy strategy;

    public Salesman(Strategy strategy) {
        this.strategy = strategy;
    }

    public void salesmanShow() {
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
