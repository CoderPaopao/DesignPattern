package prototype_pattern.light_copy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realize = new RealizeType();
        RealizeType realize2 = realize.clone();
        System.out.println(realize==realize2);
    }
}
