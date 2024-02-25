package File_Stream;

import java.io.File;
import java.io.IOException;

public class File_test_4 {
    public static void main(String []args) throws IOException {
       Search_File(new File("D:/"),"QQMusic.exe");
    }

    /*
    去目录下搜索某个文件
    * */
    public static void Search_File(File dir,String file_name) throws IOException {
        if (dir==null||!dir.exists()||dir.isFile())return;

        File[] files = dir.listFiles();

        if (files!=null&&files.length>0){
            for (File file1 : files) {
                if (file1.isFile()){
                    if (file1.getName().equals(file_name))
                    {System.out.println("Find it!"+file1.getAbsolutePath());
                    Runtime runtime=Runtime.getRuntime();
                    runtime.exec(file1.getAbsolutePath());}

                }
                else {
                    Search_File(file1,file_name);//递归寻找
                }
            }
        }
    }

    public static long f(int n){
        if (n<0) return 0;
        if (n==0) return 1;
        return f(n-1)*n;
    }

    public static long f1(int n){
        if (n<0) return -1;
        if (n==1) return 1;
        return f1(n-1)+n;
    }

    public static int f2(int n){
        if (n==10) return 1;
        if (n<0) return -1;
        return 2*(f2(n+1)+1);
    }
}