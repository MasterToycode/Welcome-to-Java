public class Stu
{
    private String name;
    private String sex;
    private double score;

    public Stu(String name, String sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public Stu() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}
