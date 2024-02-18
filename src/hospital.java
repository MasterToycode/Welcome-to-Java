public class hospital
{
    public static void main(String [] args){
        System.out.println(checkQQ("null"));
        System.out.println(checkQQ("2629549005"));
        System.out.println(checkQQ("456789ghj788"));
    }

    public static boolean checkQQ(String qq){
        return qq!=null&&qq.matches("[1-9]\\d{5,19}");
    }

}