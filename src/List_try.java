import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class List_try
{
    public static void main(String [] args){
        Collection<Student> students= new HashSet<>();
        students.add(new Student("Kobe",41,198,"male"));
        students.add(new Student("MJ",50,198,"male"));
        students.add(new Student("SGA",24,198,"male"));


        Iterator<Student> iterator =students.iterator();


        try {
            System.out.println(iterator.next().hashCode());
            System.out.println(iterator.next().hashCode());
            System.out.println(iterator.next().hashCode());
        }

        catch (Hashsame e) {
            throw new Hashsame(e.getMessage(" Same elements"));
        }

        iterator=students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }


}