package File_Stream;

import java.io.File;

public class File_Delete {
    public static void Delete_file(File dir){
        if (dir==null||!dir.exists()) return;
        if (dir.isFile()) dir.delete();
        else {
            File[] files = dir.listFiles();
            if (files==null) return;
            if (files.length==0) dir.delete();

            for (File file1 : files) {
                if (file1.isFile())
                {
                    file1.delete();
                }
                else Delete_file(file1);
            }
            dir.delete();
        }
        System.out.println("Yeah!");
    }
}
