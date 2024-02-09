import java.util.ArrayList;
import java.util.Arrays;

public class Strengthen_Java
{
    public static void main(String [] args)
    {
        Stu a1=new Stu("A","man",87);
        Stu a2=new Stu("B","man",98.5);
        Stu a3=new Stu("C","woman",91.5);
        Stu a4=new Stu("D","woman",96.75);
        Stu a5=new Stu("E","man",88);
        Stu a6=new Stu("F","man",89);
        Stu a7=new Stu("G","woman",95);

        Stu_cla_ope A = new Stu_cla_ope(new ArrayList<>(Arrays.asList(a1, a2, a3, a4, a5, a6, a7)));
         A.Print();
        A.avg_score();
    }
}