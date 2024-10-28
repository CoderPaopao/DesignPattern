package singleton_pattern.static_variable;

/**
 * 静态变量（饿汉）
 */

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
