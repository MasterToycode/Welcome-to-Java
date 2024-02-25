package File_Stream;

import java.io.File;
import java.io.IOException;

public class File_test_2 {
    public static void main(String []args) throws IOException {
        File file=new File("File_test.txt");
        System.out.println(file.createNewFile());
        File file1=new File("File_dir");
        System.out.println(file1.mkdir());

        File file2=new File("aaa/bbb/ccc/ddd");
        System.out.println(file2.mkdirs());

        System.out.println(file.delete());
        System.out.println(file1.delete());//不能删除非空文件夹
        System.out.println(file2.delete());


    }
}