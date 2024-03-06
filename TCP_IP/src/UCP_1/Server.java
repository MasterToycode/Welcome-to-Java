package UCP_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String []args) throws IOException {

        System.out.println("----------Server----------");
        DatagramSocket socket=new
                DatagramSocket(6666);
        //注册端口号！
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);

        while (true)
        {
            socket.receive(packet);
            System.out.println(new String(bytes, 0, packet.getLength()));
            System.out.println("Server have get the data!");
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("------------------------------" +
                    "-----------------------------------------");
        }
    }
}
