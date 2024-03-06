package Wechat;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> online=new ArrayList<>();
    public static void main(String []args) throws IOException {

        System.out.println("----------------------Server-----------------------");
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket=serverSocket.accept();
            online.add(socket);
            System.out.println(socket.getLocalAddress().getHostAddress()+" is online! ");
            new ServerThread(socket).start();
        }


    }
}