package char_stream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class File_writer {
    public static void main(String []args)  {
        try (Writer fileWriter = new FileWriter("src//file_char_writer.txt",true)) {

            fileWriter.write('a');
            fileWriter.write(8);
            fileWriter.write("\r\n");
            fileWriter.write("sdfghj",0,4);
            fileWriter.write("\r\n");
            char[]chars={'k','我','h','你','l'};
            fileWriter.write("\r\n");
            fileWriter.write(chars);
            fileWriter.write(chars,0,3);
            fileWriter.write("\r\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
