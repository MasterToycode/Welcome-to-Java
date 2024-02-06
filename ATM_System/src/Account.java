public class Account
{
    private String cardid;
    private String username;
    private String sex;
    private String password;
    private double money;
    private double limit;//限额

    public Account(String cardid, String username, String sex, String password, double money, double limit)
    {
        this.cardid = cardid;
        this.username = username;
        this.sex = sex;
        this.password = password;
        this.money = money;
        this.limit = limit;
    }

    public Account() {}

    public String getCardid()
    {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getUsername() {
        return (sex.equals("man")? "Mr " :"Mrs ")+username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

}
