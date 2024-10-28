package builder_pattern.make_bike;

public class ofoBuilder extends Builder {
    @Override
    public void buildFrame() {
        mbike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
