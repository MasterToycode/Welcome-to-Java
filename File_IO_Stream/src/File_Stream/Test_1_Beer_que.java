package File_Stream;

public class Test_1_Beer_que {
    public static int tatolNUmber;
    public static int lastBottles;
    public static int lastConver;

    public static void main(String []args){
        BUY(10);
        System.out.println("买的酒的总瓶数："+tatolNUmber);
        System.out.println("剩余空瓶子数："+lastConver);
        System.out.println("剩余盖子数："+lastBottles);
    }

    public static void BUY(int money){
        //用户思维：买了再说！
        int bNumber = money / 2;
        tatolNUmber=bNumber+tatolNUmber;

        //把盖子和空瓶子换成钱继续买！
        //本轮的总盖子数空瓶子数！

        int allBottlenumber=bNumber+lastBottles;
        int allConveers=bNumber+lastConver;
        int allmoney=0;
        if (allBottlenumber>=2){
            allmoney+=(allBottlenumber/2)*2;
        }
        lastBottles=allBottlenumber%2;

        if (allConveers>=4){
            allmoney+=(allConveers/4)*2;
        }
        lastConver=allConveers%4;

        if (allmoney>=2){
            BUY(allmoney);
        }
    }
}
