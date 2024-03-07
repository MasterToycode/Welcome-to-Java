package Wechat;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    public  ServerThread(Socket socket){
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
                    System.out.println(socket.getLocalAddress().getHostAddress()+" is saying :"+s);
                    //把这个消息分发给全部客户端！
                    SendMsgall(s);
                } catch (IOException e) {
                    System.out.println(socket.getLocalAddress().getHostAddress()+" is left!");
                    Server.online.remove(socket);
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


    private void SendMsgall(String s) throws IOException {
        for (Socket socket1 : Server.online) {
            OutputStream outputStream = socket1.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF(s);
            dataOutputStream.flush();
        }
    }
}
