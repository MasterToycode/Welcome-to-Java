package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String []args) throws IOException {

        System.out.println("----------------------Server-----------------------");
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket=serverSocket.accept();
            System.out.println(socket.getLocalAddress().getHostAddress()+" is online! ");
            new Myserverthread(socket).start();
        }


    }
}
