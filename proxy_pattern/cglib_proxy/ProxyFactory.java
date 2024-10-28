package proxy_pattern.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    //声明火车站对象
    private TrainStation trainStation;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取一定的代理费用（CGLib代理）");
        //要调用目标对象的方法
        Object object = method.invoke(trainStation, objects);
        return object;
    }

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于JDK代理中的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //设置代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

}
