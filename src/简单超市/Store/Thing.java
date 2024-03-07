package Store;

public class Thing {
    private double money;
    private String name;
    private String dateTime;

    public Thing(double money, String name, String dateTime) {
        this.money = money;
        this.name = name;
        this.dateTime = dateTime;
    }

    public Thing() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
