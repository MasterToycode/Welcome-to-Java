import java.util.ArrayList;
import java.util.Scanner;

class Food
{
    private String name;
    private double price;
    private String desc;

    public Food(String name, double price, String desc)
    {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }
    public Food(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}



class FoodOperator
{
    private ArrayList<Food> foodlist= new ArrayList<>();
    public Scanner s=new Scanner(System .in);
    public void Add_food()
    {
        Food f=new Food();
        System.out.println("Please input the name of the food: ");
        String name=s.next();
        f.setName(name);

        System.out.println("Please input the price of the food: ");
        double price=s.nextInt();
        f.setPrice(price);

        System.out.println("Please input the desc of the food: ");
        String desc=s.next();
        f.setDesc(desc);

        foodlist.add(f);
    }

    public void Show_all_food()
    {
        if (foodlist.isEmpty()) {
            System.out.println("There is nothing !"); return;}
        for (int i = 0; i < foodlist.size(); i++)
        {
            System.out.println(foodlist.get(i).getName());
            System.out.println(foodlist.get(i).getPrice());
            System.out.println(foodlist.get(i).getDesc());
        }
    }


    public void Start()
    {
        System.out.println("Welcome to !");
        while (true)
        {
            System.out.println("Please choose what you are willing to do ?");
            System.out.println("1. add the food");
            System.out.println("2. show all the fo,.od you have added");
            System.out.println("3. Out the system !Thank you ");
            String choose=s.next();
            switch (choose)
            {
                case "1":Add_food();break;
                case "2":Show_all_food();break;
                case "3":return;
                default:
                    System.out.println("What you have input is not valid! Please input again!");
            }
        }
    }
}




public class Merchant_system
{
    public static void main(String [] args)
    {
        FoodOperator fo=new FoodOperator();
        fo.Start();
    }
}

