package IP_test;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;

public class test_ip_1 {
    public static void main(String []args) throws IOException {

        InetAddress localHost = Inet4Address.getLocalHost();

        System.out.println(localHost.getHostAddress());
        System.out.println(localHost.getHostName());

        InetAddress byName = Inet4Address.getByName("www.baidu.com");
        //获取的都是对象！

        System.out.println(byName.getHostAddress());
        System.out.println(byName.getHostName());

        System.out.println(byName.isReachable(6000));//相当于在cmd中 执行ping www.baidu.com
    }
}
