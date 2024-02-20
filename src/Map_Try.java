import javax.swing.text.html.HTMLDocument;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Map_Try {
    public static void main(String [] args){
        Collection<Integer> integers=new TreeSet<>();
        integers.add(6);
        integers.add(24);
        integers.add(23);
        integers.add(8);
        integers.add(1);
        System.out.println(integers);

        Collection<Student> students=new TreeSet<>(
                (o1,o2)->Double.compare(o1.getHeight(),o2.getHeight())
        );//默认按照在集合中自定义的比较规则！！！


        students.add(new Student("Kobe",41,196,"male"));
        students.add(new Student("MJ",50,198,"male"));
        students.add(new Student("SGA",24,199,"male"));
        students.add(new Student("James",39,213,"male"));

        System.out.println(students);

        Iterator<Student> studentIterator=students.iterator();
        while (studentIterator.hasNext()){
            String s=studentIterator.next().getName();
            if (s.contains("s"))
                studentIterator.remove();
        }
        System.out.println(students);
        /*
        这里解决了并发修改异常的BUG
        这个是一个经典的错误
        解决方法：
        1.使用迭代器自己的删除方法删除数据
        2.如果可以使用常规的for循环遍历集合，每删除一个元素。索引后移一个单位。或者倒着遍历整个集合！


        注意：
        增强for循环本质上使用了迭代器，但是没有得到迭代器，所以无法解决错误
        使用Lambda表达式也无法解决问题！
        *
        *
        * */
    }
}
