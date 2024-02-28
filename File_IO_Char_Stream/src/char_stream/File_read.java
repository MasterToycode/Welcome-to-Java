package char_stream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_read {
    public static void main(String []args) throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("src\\file_char_stream.txt"))
        {
//            int len;
//            while ((len=fileReader.read())!=-1){
//                System.out.print((char) len);
//                }
            char[] c=new char[6];
            int len;
            while ((len= fileReader.read(c))!=-1)
            {
                System.out.print(new String(c, 0, len));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
