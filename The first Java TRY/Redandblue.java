import java.util.*;
public class Redandblue
{
    public static void main(String [] args)
    {
        GETIT g=new GETIT();
        int []user_numbers=g.userSelectnumber();
        int []lucky_numbers=g.createLucknumber();
        g.Judge(user_numbers,lucky_numbers);
        System.out.println("The 824th answer is : ");
        g.Printing(lucky_numbers);
    }
}



class GETIT
{
    private static List<Integer> generateRandomOrderList(int size)
    {
        List<Integer> orderList = new ArrayList<>();
        for (int i = 1; i <=size; i++)
        {
            orderList.add(i);
        }
        Collections.shuffle(orderList);
        return orderList;
    }



    private static boolean  Isnotsame(int [] a,int m)
    {
        for (int i =0; i <a.length ; i++)
        {
           if(a[i]==0) break;
           if(a[i]!=0) {if(a[i]==m)return false;}
        }
        return true;
    }



    public static int [] userSelectnumber()
    {
        int []UserNumber=new int[7];
        Scanner s=new Scanner(System.in);
        boolean key=false;
        for (int i = 0; i < UserNumber.length-1; i++)
        {
            key=false;
            while(!key)
            {
                System.out.println("Please input the number of the "+(i+1)+" red ball(1~33) No Repeating!");
                int data=s.nextInt();
                if (data>=1&&data<=33)
                {
                    if(Isnotsame(UserNumber,data))
                    {
                        UserNumber[i]=data;
                        key=true;
                    }
                    else
                    {
                        System.out.println("The number you input exist that there are same numbers ! Please input again!");
                        key=false;
                    }
                }
                else
                {
                    System.out.println("Sorry ! You have inputed the wrong number !Please input again");
                    key=false;
                }
            }
        }

        key=false;
        while(!key)
        {
            System.out.println("Please input the number of the blue ball: (1~16)");
            int data = s.nextInt();
            if (data>=1&&data<=16)
            {
                UserNumber[6]=data;
                key=true;
            }
            else
            {
                System.out.println("Sorry ! You have inputed the wrong number !Please input again");
                key=false;
            }
        }

        return UserNumber;
    }




    public static int [] createLucknumber()
    {
        int []LuckNumber=new int[7];
        List<Integer> randomOrderList = generateRandomOrderList(33);
        Random r=new Random();
        for (int i = 0; i <6 ; i++)
        {
            LuckNumber[i]=randomOrderList.get(i);
        }
        LuckNumber[6]=r.nextInt(16)+1;
        return LuckNumber;
    }




    public static void Judge(int [] usernumbers,int [] lucknumbers)
    {
        int redcount=0;
        int bluecount=0;
        for (int i = 0; i < usernumbers.length-1; i++)
        {
            for (int j = 0; j <lucknumbers.length-1 ; j++)
            {
                if(Isnotsame(lucknumbers,usernumbers[i]))redcount++;
            }
        }
        if(usernumbers[usernumbers.length-1]==lucknumbers[lucknumbers.length-1])bluecount++;
        calculatePrize(redcount, bluecount);

    }



    private static void calculatePrize(int redcount, int bluecount)
    {
        int basePrize = 10000000;

        switch (redcount)
        {
            case 6:
                switch (bluecount) {
                    case 1:
                        System.out.println("恭喜你中了一等奖！奖金为 " + basePrize + " 元");
                        break;
                    default:
                        System.out.println("恭喜你中了二等奖！奖金为 " + (basePrize / 2) + " 元");
                        break;
                }
                break;
            case 5:
                switch (bluecount) {
                    case 1:
                        System.out.println("恭喜你中了三等奖！奖金为 " + (basePrize / 5) + " 元");
                        break;
                    default:
                        System.out.println("恭喜你中了四等奖！奖金为 " + (basePrize / 50) + " 元");
                        break;
                }
                break;
            case 4:
                switch (bluecount) {
                    case 1:
                        System.out.println("恭喜你中了五等奖！奖金为 " + (basePrize / 100) + " 元");
                        break;
                    default:
                        System.out.println("恭喜你中了六等奖！奖金为 " + (basePrize / 200) + " 元");
                        break;
                }
                break;
            case 3:
                switch (bluecount) {
                    case 1:
                        System.out.println("恭喜你中了七等奖！奖金为 " + (basePrize / 500) + " 元");
                        break;
                    default:
                        System.out.println("恭喜你中了八等奖！奖金为 " + (basePrize / 5000) + " 元");
                        break;
                }
                break;
            case 2:
                switch (bluecount)
                {
                    case 1:
                        System.out.println("恭喜你中了九等奖！奖金为 " + (basePrize / 50000) + " 元");
                        break;
                    default:
                        System.out.println("恭喜你中了十等奖！奖金为 " + (basePrize / 100000) + " 元");
                        break;
                }
                break;
            case 1:
                System.out.println("很遗憾，没有中奖。");
                break;
            default:
                System.out.println("很遗憾，没有中奖。");
                break;
        }
    }


    public static void Printing(int []a)
    {
        for(int number:a)
        {
            System.out.print(number+" ");
        }
    }
}