import java.util.ArrayList;

public class Buy
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java 入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("人工智能算法工程师");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++)
        {
            String temp1 = list.get(i);
            if (temp1.contains("枸杞"))
            {
                list.remove(temp1);
                i--;// 注意这里需要递减 i，以防漏掉元素
            }
        }
        System.out.println(list);
    }

}

