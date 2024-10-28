package singleton_pattern.static_code_block;

/**
 * 静态代码块（饿汉）
 */

public class Singleton {

    private Singleton() {

    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}
