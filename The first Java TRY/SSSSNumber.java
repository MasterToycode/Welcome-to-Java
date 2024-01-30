import java.util.*;
public class SSSSNumber
{
    public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        NumberS s = new NumberS();
        System.out.print("Please input the number : ");
        int data=c.nextInt();
        System.out.println("The cryptographic number is : "+s.number(data));
        System.out.println(s.number(Integer.parseInt(s.number(data))));
    }
}


class NumberS
{
    public static String number(long s)
    {
        StringBuilder modifiedDigits = new StringBuilder();
        while (s > 0)
        {
            long digit = s % 10;
            modifiedDigits.append((digit + 5) % 10);
            s /= 10;
        }
        return modifiedDigits.toString();
    }
}