package builder_pattern.make_bike;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mbike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mbike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mbike;
    }
}
