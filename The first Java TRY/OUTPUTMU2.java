import java.util.Scanner;
public class OUTPUTMU2
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Please input the row you want to print :");
        int n=s.nextInt();
        for (int i = 1; i <=n; i++)
        {
            for (int j = n; j >i ; j--)
            {
                System.out.print(" ");
            }
            for (int j =0; j <2*i-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}