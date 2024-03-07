package homework_1;

public class work_1 {
    public static void main(String []args){
        Mycomples mycomples1 = new Mycomples(1, 2);

        Mycomples mycomples2 = new Mycomples(3, 4);

        System.out.print("There are two numbers: ");
        mycomples2.Printing(true);
        mycomples1.Printing(false);

        System.out.println("The answers as follow: ");
        mycomples1.add(mycomples2).Printing(true);
        mycomples1.sub(mycomples2).Printing(true);

        mycomples1.mul(mycomples2).Printing(true);
        mycomples1.div(mycomples2).Printing(true);

    }
}
