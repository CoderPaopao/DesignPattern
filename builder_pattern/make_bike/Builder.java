package builder_pattern.make_bike;

public abstract class Builder {

    protected Bike mbike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
