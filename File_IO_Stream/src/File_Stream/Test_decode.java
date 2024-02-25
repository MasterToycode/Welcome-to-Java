package File_Stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test_decode {
    public static void main(String []args) throws UnsupportedEncodingException {
        String data="a我b";
        byte[] bytes = data.getBytes();//默认按照平台字符集
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //jiema

        String s = new String(bytes);//按照默认解码
        System.out.println(s);

        String s1 = new String(bytes1,"GBK");
        System.out.println(s1);

    }
}