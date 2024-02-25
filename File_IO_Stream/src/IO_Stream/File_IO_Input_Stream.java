package IO_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class File_IO_Input_Stream {

    public static void main(String []args) throws IOException {
        //File file=new File("File_Input_Stream.txt");
        //file.createNewFile();

        InputStream fileInputStream = new FileInputStream("File_Input_Stream.txt");
//        int read = fileInputStream.read();
//        System.out.println(read);
//
//        int read1 = fileInputStream.read();
//        System.out.println(read1);
        //每次读取一个字节，没有数据返回-1

        //使用循环改造代码
        int b;//用于记住读取的字节
        while ((b=fileInputStream.read())!=-1){
            System.out.print((char)b);
        }//性能很差
        //读取汉字输出会乱码，无法避免
        //流使用完毕必须关闭释放系统资源

        fileInputStream.close();

    }
}
