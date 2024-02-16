import java.util.Objects;

public class Some_try_to_API {
        public static void main(String [] args){
            Student s1=new Student("James",39,89);
            Student s2=new Student("Kobe",24,100);
            Student s3=null;
            Person p1=new Person("MJ",50);
            System.out.println(s1.equals(s2));
            System.out.println(s1.equals(s3));
            System.out.println(s1.toString());
            System.out.println(p1.toString());
        }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class Student extends Person implements Comparable<Student>{
    private double Score;

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        Score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "Score=" + Score +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(getScore(), student.getScore()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScore());

    }

    @Override
    public int compareTo(Student o)
    {
        return  o.getAge()-this.getAge();
    }
}




















