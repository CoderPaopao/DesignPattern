package proxy_pattern.static_proxy;

public class Client {

    public static void main(String[] args) {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }

}
