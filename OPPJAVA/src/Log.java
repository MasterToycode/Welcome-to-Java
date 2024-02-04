import java.util.Random;
import java.util.Scanner;
public class Log
{
    public static void main(String [] args)
    {
        for (int i=0;i<3;i++)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Please input the log_name: ");

            String log_name = s.next();
            System.out.println("Please input the password: ");
            String password = s.next();

            System.out.println("The code is blew: ");
            String valid_code=create_code(4);
            System.out.println(valid_code);
            System.out.println("Please input the code: ");
            String code=s.next();

            if (Is_right(log_name, password)&&code.equals(valid_code)){ System.out.println("Welcome!");break;}
            else System.out.println("Wrong! Please input again !");
        }
    }

    public static boolean Is_right(String valid_name,String valid_word)
    {
        return  (valid_name.equals("kobeforver824@qq.com")&&valid_word.equals("123456"));
    }

    public static String create_code(int n)
    {
        StringBuilder code=new StringBuilder();
        String sa_code="qwertyuioasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
        Random r=new Random();
        for (int i = 0; i < n; i++)
        {
            int index=r.nextInt(sa_code.length());
            code.append(sa_code.charAt(index));
        }
        return code.toString();
    }

}