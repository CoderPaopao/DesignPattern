package proxy_pattern.JDK_proxy;

public class Client {

    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用工厂对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        //3.调用sell()方法
        proxyObject.sell();

//        System.out.println(proxyObject.getClass());
//
//        //让程序一直运行
//        while(true) {}
    }

}
