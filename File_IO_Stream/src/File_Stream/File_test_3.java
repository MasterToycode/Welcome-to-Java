package File_Stream;

import java.io.File;

public class File_test_3 {
    public static void main(String [] args){
        File file=new File("D://不会编程//Java//File_IO_Stream");
        String[] list1 = file.list();
        for (String s : list1) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsolutePath());
        }
        //以上所有方法只能访问一级文件夹


    }
}
