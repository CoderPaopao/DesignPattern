package decorator_pattern;

public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public float cost() {
        return super.getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
