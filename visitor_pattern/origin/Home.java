package visitor_pattern.origin;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 */

public class Home {

    //声明一个集合对象
    private List<Animal> nodeList = new ArrayList<Animal>();

    //添加元素
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        //遍历，让访问者访问每一个角色
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }

}
