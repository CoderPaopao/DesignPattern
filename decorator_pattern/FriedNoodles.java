package decorator_pattern;

/**
 * 炒饭类（具体构件类）
 */

public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(10.5F,"炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
