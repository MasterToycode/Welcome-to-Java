import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Try_to_Lambda {
    public static void main(String [] args){
        Student [] students=new Student[4];
        students[0]=new Student("Kobe",24,100);
        students[1]=new Student("James",39,69);
        students[2]=new Student("MJ",50,150);
        students[3]=new Student("SGA",20,120);

        Arrays.sort(
                students,
                (o1, o2) -> Double.compare(o1.getScore(), o2.getScore())
        );

        System.out.println(Arrays.toString(students));
    }
}