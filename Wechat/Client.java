package Wechat;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client
{
    public static void main(String []args) throws IOException
    {

        Socket socket = new Socket("127.0.0.1", 8888);
        new ClientThread(socket).start();

        OutputStream os = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(os);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Say: ");
            String s = scanner.nextLine();

            if (s.equals("exit"))
            {
                System.out.println("See you next time!");
                dataOutputStream.close();
                socket.close();
                break;
            }
            else
            {
                dataOutputStream.writeUTF(s);
                dataOutputStream.flush();//刷新，保证缓存区的内容写到
            }

        }

    }
}