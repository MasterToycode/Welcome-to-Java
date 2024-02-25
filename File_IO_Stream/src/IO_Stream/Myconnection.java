package IO_Stream;

public class Myconnection implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("结束了与某个硬件的连接");
    }
}
