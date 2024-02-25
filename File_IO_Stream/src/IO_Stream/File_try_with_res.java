package IO_Stream;

import java.io.*;

public class File_try_with_res {
    public static void main(String []args)  {

        try (InputStream  fileInputStream = new FileInputStream("D:\\imppic\\Camera Roll\\img-1661344751451883c27d5b4758a00149eb3cabaaf801a.jpg");
             OutputStream fileOutputStream = new FileOutputStream("D:\\imppic\\Screenshots\\kobe.jpg");
             Myconnection myconnection =new Myconnection();
        )

        {//这里只能放置资源对象！
            //实现了AutoCloseable接口！！的称为资源对象
            //使用完之后自动调用close()方法！！！

            byte [] bytes=new byte[1024];//1KB

            int len;

            while ((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
            System.out.println(myconnection);
            System.out.println("Success! ");
            //可以复制一切文件，只要文件的后缀名一直！！
            //字节流可以做一切文件的复制，在计算机底层v，所有数据和文件都以字节的形式储存！！
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //专业级释放流资源！!!!
    }
}
