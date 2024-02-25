package IO_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_IO_Stream_2 {
    public static void main(String []args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("File_Input_Stream.txt");
        byte[] buffer=new byte[3];

//        int read = fileInputStream.read(buffer);
//        String s = new String(buffer);
//        System.out.println("每次读取的字节数量： "+read);
//        System.out.println(s);
//
//
//        int read1 = fileInputStream.read(buffer);
//
//        //注意：读取多少，倒出多少！
//        String s1 = new String(buffer,0,read1);//指定读取的字节数，并不全部读取解码
//
//        System.out.println("每次读取的字节数量： "+read1);
//        System.out.println(s1);
//
//        int read2 = fileInputStream.read(buffer);
//        System.out.println(read2);//读取完毕就返回-1

//循环改造以上代码

        int len;
        while ((len=fileInputStream.read(buffer))!=-1){
            String s = new String(buffer, 0, len);
            System.out.print(s);
        }
        fileInputStream.close();
        //不能避免汉字读取乱码的问题
    }
}
