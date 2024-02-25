package IO_Stream;

public class File_Stream_Freee {
    public static void main(String []args){
        try {
            System.out.println(10/0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally-->");//除非JVM停止！

        }

        //一般用于释放资源


    }
}
