package strategy_pattern;

/**
 * 具体策略类
 */

public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满一千换购任意两百以内的商品");
    }
}
