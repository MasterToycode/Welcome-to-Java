package File_Stream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class File_test_1 {
    public static void main(String []args){
        File file=new File("D:"+File.separator+"不会编程"+File.separator+"Java"+File.separator+"Java_File_test.txt");
        System.out.println(file);
        System.out.println(file.length());
        System.out.println("--------------------------------------------------------");
        File file1=new File("D:\\不会编程\\Java");
        System.out.println(file1.length());
        System.out.println("--------------------------------------------------------");
        System.out.println(file1.exists());
        System.out.println(file.exists());
        System.out.println("--------------------------------------------------------");
        File file2=new File("..\\File_IO_Stream\\file.txt");
        System.out.println(file2.length());
        System.out.println(file2.exists());
        System.out.println(System.getProperty("user.dir"));
        System.out.println("--------------------------------------------------------");



        File file3=new File("..\\Java_File_test.txt");
        System.out.println(file3.exists());
        System.out.println(file3.isFile());
        System.out.println(file3.isDirectory());
        long time=file3.lastModified();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(time));


    }
}