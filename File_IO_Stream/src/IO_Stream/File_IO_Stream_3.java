package IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_IO_Stream_3 {
    public static void main(String []args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("File_Input_Stream.txt");
//
//        File file = new File("File_Input_Stream.txt");
//        long size = file.length();
//        byte[] b=new byte[ (int) size];//适合读取小文件
//        int i=fileInputStream.read(b);
//
//        System.out.println(size);
//        System.out.println(i);
//
//        fileInputStream.close();
//
//

        byte[] bytes = fileInputStream.readAllBytes();
        System.out.println(new String(bytes));
        //如果文件过大，可能溢出！
        //读写更适合字符流
        //字节流适合做数据的转移
    }
}
