import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;
    private String sex;

    public Student(String name, int age, double height, String sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    public Student() {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Double.compare(getHeight(), student.getHeight()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getSex(), student.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight(), getSex());
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
