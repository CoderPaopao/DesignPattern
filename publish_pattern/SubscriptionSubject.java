package publish_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */

public class SubscriptionSubject implements Subject {

    //定义一个存储观察者对象的集合
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            //调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
