package Frame;

import org.junit.Test;

import java.io.FileNotFoundException;

public class frame {
    @Test
    public void save() throws  IllegalAccessException, FileNotFoundException {
        Student student=new Student("SGA",26,"man",198);
        Teacher teacher=new Teacher("HH",10000);


        ObjectFrame.OBJECT(teacher);
        ObjectFrame.OBJECT(student);
    }
}
