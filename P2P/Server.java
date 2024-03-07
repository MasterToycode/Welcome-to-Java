package P2P;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String []args) throws IOException {

        System.out.println("----------------------Server-----------------------");
        System.out.println("Server is running on http://127.0.0.1:8888/");
        ServerSocket serverSocket = new ServerSocket(8888);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                8,
                8,
                0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        do {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getLocalAddress().getHostAddress() + " is online! ");
               threadPoolExecutor.execute(new ServerRunnable(socket));
            } while (true);
        }

}
