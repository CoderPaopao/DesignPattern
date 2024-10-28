package strategy_pattern;

/**
 * 具体策略类
 */

public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满两百送五十");
    }
}
