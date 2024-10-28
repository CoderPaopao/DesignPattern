package flyweight_pattern;

import java.util.HashMap;

/**
 * 工厂类，将该类设计为单例
 */

public class BoxFactory {

    private HashMap<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    public static BoxFactory getInstance() {
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    public AbstractBox getShape(String name) {
        return map.get(name);
    }

}
