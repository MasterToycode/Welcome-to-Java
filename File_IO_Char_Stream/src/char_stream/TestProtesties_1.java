package char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.function.BiConsumer;

public class TestProtesties_1 {
    public static void main(String []args) throws IOException {
        Properties properties=new Properties();
        properties.load( new FileReader("..\\File_IO_Char_Stream\\src\\user.propeties"));

        System.out.println(properties.getProperty("admin"));
        System.out.println(properties.getProperty("SGA"));

        properties.forEach((s,v)-> System.out.println(s+"---->"+v));

        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"--->"+properties.getProperty(string));
        }
    }
}
