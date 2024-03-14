package Frame;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;

public class ObjectFrame {
    public static void OBJECT(Object o) throws IllegalAccessException, FileNotFoundException {
        PrintStream printStream=new PrintStream(new FileOutputStream("src//data2.txt",true),true, StandardCharsets.UTF_8);
        Class<?> aClass = o.getClass();
        String simpleName = aClass.getSimpleName();
        printStream.println("---------------"+simpleName+"----------------");
        Field[] declaredFields =
                aClass.getDeclaredFields();


        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            declaredField.setAccessible(true);
            String o1 = declaredField.get(o)+" ";
            printStream.println(name+"----->"+o1);
        }
        printStream.close();
    }
}
