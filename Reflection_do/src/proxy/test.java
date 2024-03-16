package proxy;
public class test {
    public static void main(String[] args) {
        Star idol = new Star("idol");
        Star_proxy proxy = ProxyUtil.create_proxy(idol);
        proxy.dance();
        System.out.println(proxy.sing("S"));
    }
}
