package P2P;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerRunnable implements Runnable{
    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket = socket;
    }

    public ServerRunnable() {
    }

    @Override
    public void run() {
        try (OutputStream outputStream = socket.getOutputStream())
        {
            PrintStream dataOutputStream=new PrintStream(outputStream);
            dataOutputStream.println("HTTP/1.1 200 OK");
            dataOutputStream.println("Content-Type: text/html;charset=UTF-8");
            dataOutputStream.println();
            dataOutputStream.println("<div style='color:pink;font-size:120px;text-align:center'>What a play by Bryant!<div>");
            dataOutputStream.close();
            outputStream.close();
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
