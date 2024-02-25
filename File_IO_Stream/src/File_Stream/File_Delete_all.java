package File_Stream;

import java.io.File;

public class File_Delete_all {
    public static void main(String []args){
    File file=new File("D:\\不会编程\\Java\\File_IO_Stream\\aaa");
    Delete_file(file);
    }
    public static void Delete_file(File dir){
        if (dir==null||!dir.exists()) return;
        if (dir.isFile()) dir.delete();
        else {
        File[] files = dir.listFiles();
        if (files==null) return;//没有访问权限的时候
        if (files.length==0) dir.delete();

        for (File file1 : files) {
                if (file1.isFile())
                {
                    file1.delete();
                }
                else Delete_file(file1);
            }
        dir.delete();//递归之后删除自己
        }
        System.out.println("Yeah!");
    }
}
