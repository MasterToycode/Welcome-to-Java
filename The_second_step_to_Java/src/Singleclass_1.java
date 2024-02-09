public class Singleclass_1
{
    private  Singleclass_1(){}
    private static Singleclass_1 a=new Singleclass_1();
    public static Singleclass_1 getInstance()
    {
        return a;
    }
}
//饿汉式单例模式