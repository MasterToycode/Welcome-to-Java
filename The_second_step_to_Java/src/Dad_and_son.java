public class Dad_and_son
{
    private String name;
    private double page;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPage() {
        return page;
    }
    public void setPage(double page) {
        this.page = page;
    }

    public Dad_and_son(String name, double page) {
        this.name = name;
        this.page = page;
    }

    public Dad_and_son() {
    }
}


class Teacher extends Dad_and_son
{
    private String skill;
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void Print(){
        System.out.println(getName()+" can "+getSkill());
    }

    public Teacher(String name, double page, String skill)
    {
        super(name, page);
        this.skill = skill;
    }
    public Teacher(){

    }
}




class Stdudent extends Dad_and_son
{
        private String school_name;
        private int age;

    public Stdudent(String name, double page, String school_name, int age)
    {
        super(name, page);
        this.school_name = school_name;
        this.age = age;
    }

    public Stdudent() {}

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Stdudent(String name, double page, int age) {
       this(name,page,"清华大学",age);
    }
    public void Print(){
        System.out.println(getName() + " is at " + getSchool_name());
    }

}







