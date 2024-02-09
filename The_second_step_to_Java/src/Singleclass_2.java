public class Singleclass_2
{
    private Singleclass_2(){}
    private static Singleclass_2 b;
    public static Singleclass_2 getInstance()
    {
        if (b==null) b=new Singleclass_2();
        return b;
    }
}
//懒汉式单例模式