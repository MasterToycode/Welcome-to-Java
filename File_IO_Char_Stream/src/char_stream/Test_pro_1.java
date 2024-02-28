package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test_pro_1 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileReader("..\\File_IO_Char_Stream\\src\\user.propeties"));

        if (properties.contains("Kobe"))
            properties.setProperty("kobe","Skywalker");

        properties.store(new FileWriter("..\\File_IO_Char_Stream\\src\\user.propeties"),"Success");

        properties.forEach((s,v)-> System.out.println(s+"--->"+v));

    }
}
