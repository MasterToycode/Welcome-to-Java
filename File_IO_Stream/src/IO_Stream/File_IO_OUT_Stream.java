package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class File_IO_OUT_Stream
{
    public static void main(String []args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("File_Input_Stream_1.txt",true);

        fileOutputStream.write(100);
        fileOutputStream.write('d');

        fileOutputStream.write("\r\n".getBytes());
        byte[] bytes = "I love you".getBytes();
        fileOutputStream.write(bytes);

        fileOutputStream.close();

    }
}
