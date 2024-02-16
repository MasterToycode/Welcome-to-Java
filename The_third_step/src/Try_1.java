import java.util.StringJoiner;

public class Try_1
{
    public static void main(String [] args){
        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int [] arr){
        if (arr==null)return null;

        StringJoiner aj=new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            aj.add(arr[i]+"");
        }
        return aj.toString();
    }
}
