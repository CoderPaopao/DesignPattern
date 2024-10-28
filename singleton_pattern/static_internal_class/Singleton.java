package singleton_pattern.static_internal_class;

/**
 * 静态内部类（懒汉）
 */

public class Singleton {

    private static boolean flag = false;

    //私有构造方法
    private Singleton() {
        //用于解决反射时，多次拷贝单例对象，从而破坏单例模式
        synchronized (Singleton.class) {
            //flag为true，则非第一次创建，直接抛异常
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
