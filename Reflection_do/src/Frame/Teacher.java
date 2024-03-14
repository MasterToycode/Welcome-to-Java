package Frame;

public class Teacher {
    private String name;
    private double saray;
    public Teacher(String name, double saray) {
        this.name = name;
        this.saray = saray;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaray() {
        return saray;
    }

    public void setSaray(double saray) {
        this.saray = saray;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", saray=" + saray +
                '}';
    }
}
