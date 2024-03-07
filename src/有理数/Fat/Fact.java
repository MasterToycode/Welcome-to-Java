package Fat;

public class Fact {
    public static void main(String []args)
    {
        Number number = new Number(24, 18);
        Number number1 = new Number(3, 9);

        System.out.println("约分之后的结果： ");
        System.out.println(number1.scrify().toString());
        System.out.println(number.scrify().toString());

        System.out.println("The comparison as follows: ");
        System.out.println(number.Com(number1)?
                number.toString()+">"+number1.toString():number1.toString()+">"+number.toString());

        System.out.println("The answers as follow: ");
        System.out.println(number.Add(number1).toString());
        System.out.println(number.Sub(number1).toString());
        System.out.println(number1.Sub(number).toString());
        System.out.println(number.Mul(number).toString());
        System.out.println(number.OPPMUL(number1).toString());
    }
}
