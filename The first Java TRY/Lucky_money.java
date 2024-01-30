import java.util.*;

public class Lucky_money {
    public static void main(String[] args) {
        LUCKYMONEY l = new LUCKYMONEY();
        int[] money = {9, 666, 188, 520, 9999};
        l.start(money);
    }
}

class LUCKYMONEY
{

    private List<Integer> generateRandomOrderList(int size)
    {
        List<Integer> orderList = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            orderList.add(i);
        }
        Collections.shuffle(orderList);
        return orderList;
    }

    public void start(int[] money)
    {
        Scanner scanner = new Scanner(System.in);

        // 生成随机顺序的列表，只需生成一次
         List<Integer> randomOrderList = generateRandomOrderList(money.length); // 声明随机顺序列表

        for (int i = 0; i < money.length; i++)
        {
            System.out.println("Any key to start: ");
            scanner.nextLine();
            System.out.println("congratulations! You get " + money[randomOrderList.get(i)] + "$");
        }

        System.out.println("Game Over! See you next time!");
        scanner.close();
    }
}
