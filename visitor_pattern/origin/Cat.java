package visitor_pattern.origin;

/**
 * 具体元素角色类
 */

public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("吃，喵");
    }
}
