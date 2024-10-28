package singleton_pattern.double_check_lock;

/**
 * 双重检查锁（懒汉）
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

    private static Singleton instance;

    //提供公共的访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance为null，则抢锁
        if (instance == null) {
            synchronized (Singleton.class) {
                //抢锁后再次判断是否为空
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    private Object readResolve() {
        return instance;
    }
}
