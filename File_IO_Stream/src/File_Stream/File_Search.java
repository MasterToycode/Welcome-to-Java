package File_Stream;

import java.io.File;
import java.io.IOException;

public class File_Search {
    public static void Search_File(File dir, String file_name) throws IOException {
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
}
