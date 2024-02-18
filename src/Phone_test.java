import java.util.Scanner;

public class Phone_test
{
    public static void main(String []args){
       // checkphone();
        //checkmail();
        checktime();
    }

    public static void checkphone(){
        while (true) {
            System.out.println("Please input your phone number: ");
            Scanner s=new Scanner(System.in);
            String PHone=s.next();
            if (PHone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")) {
                System.out.println("Success");
                break;
            }
            else System.out.println("Wrong phone number");
        }
    }

    public static void checkmail(){
        while (true) {
            System.out.println("Please input your mail: ");
            Scanner s=new Scanner(System.in);
            String PHone=s.next();
            if (PHone.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("Success");
                break;
            }
            else System.out.println("Wrong mail");
        }
    }

    public static void checktime(){
        while (true) {
            System.out.println("Please input time(xx:yy:zz): ");
            Scanner s=new Scanner(System.in);
            String PHone=s.next();
            if (PHone.matches("[0-23]\\d{1}(:[0-59]\\d{1}){2}")) {
                System.out.println("Success");
                break;
            }
            else System.out.println("Wrong time");
        }
    }


}
