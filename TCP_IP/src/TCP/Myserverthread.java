package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Myserverthread extends Thread {

    public  Myserverthread(Socket socket){
        this.socket=socket;
    }

    private Socket socket;
    @Override

    public void run() {
        try (InputStream is = socket.getInputStream();
        ) {

            DataInputStream dataInputStream = new DataInputStream(is);
            while (true)
            {

                try {
                    String s = dataInputStream.readUTF();
                    System.out.println(s);
                } catch (IOException e) {
                    System.out.println(socket.getLocalAddress().getHostAddress()+" is left!");
                    dataInputStream.close();
                    is.close();
                    socket.close();
                    break;
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
