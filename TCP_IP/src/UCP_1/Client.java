package UCP_1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String []args) throws IOException {
        DatagramSocket socket=new DatagramSocket();//客户端！

//        public DatagramPacket(byte[] buf, int length,
//        InetAddress address, int port) {
//        }//第三个参数是服务器的端口！

        Scanner scanner=new Scanner(System .in);
        while (true) {
            String next = scanner.nextLine();
            if (next.equals("exit")){
                System.out.println("See you next time");
                socket.close();
                break;
            }

            else {

            byte[] bytes =next.getBytes();
            InetAddress address=InetAddress.getLocalHost();
            //这是在自己电脑上实验，直接获取自己电脑的ip地址
                DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,6666);
            socket.send(packet);
            }
        }

        System.out.println("Client have sent the data!!");

    }
}
