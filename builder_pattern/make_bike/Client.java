package builder_pattern.make_bike;

public class Client {
    public static void main(String[] args) {
        showBike(new MobikeBuilder());
        showBike(new ofoBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }

}
