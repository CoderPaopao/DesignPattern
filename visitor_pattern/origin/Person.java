package visitor_pattern.origin;

/**
 * 抽象访问者角色类
 */

public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);

}
