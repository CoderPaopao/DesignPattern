package visitor_pattern.dynamic_dispatch;

public class Dog extends Animal {
    @Override
    public void execute() {
        System.out.println("dog");
    }
}
