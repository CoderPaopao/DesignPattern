package proxy_pattern.cglib_proxy;

public class Client {

    public static void main(String[] args) {
        //创建工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }

}
