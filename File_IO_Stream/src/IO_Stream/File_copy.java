package IO_Stream;

import java.io.*;

public class File_copy {
    public static void main(String []args)  {
        InputStream fileInputStream=null;
        OutputStream fileOutputStream=null;


        try {
            fileInputStream = new FileInputStream("D:\\imppic\\Camera Roll\\img-1661344751451883c27d5b4758a00149eb3cabaaf801a.jpg");

            fileOutputStream = new FileOutputStream("D:\\imppic\\Screenshots\\kobe.jpg");

            byte [] bytes=new byte[1024];//1KB

            int len;

            while ((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }

            System.out.println("Success! ");
            //可以复制一切文件，只要文件的后缀名一直！！
            //字节流可以做一切文件的复制，在计算机底层v，所有数据和文件都以字节的形式储存！！
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
        //专业级释放流资源！!!!

        finally {

            try {
                if (fileOutputStream!=null)fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            try {
                if (fileInputStream!=null)fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
