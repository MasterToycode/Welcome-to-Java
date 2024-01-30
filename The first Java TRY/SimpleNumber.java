public class SimpleNumber
{
    public static void main(String [] args)
    {
        NUMBER n=new NUMBER();
        System.out.println("We have found numbers: ");
        int count=n.Find(8,824);
        System.out.println("There are "+count);
    }
}


class NUMBER
{
    public static boolean isPrime(int number)
    {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int Find(int n,int m)
    {
        int count=0;
        for (int i = n; i <=m ; i++)
        {
            if (isPrime(i))
            {   count++;
                System.out.println(i);
            }
        }
        return count;
    }
}