import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawling
{
    public static void main(String []args){
        method();
        method1();
    }

    public static void method(){

        String data="   来黑马程序员学习 Java, \n" +
                "       电话； 1866668888 ， 18699997777 \n "+
                "       或者联系箱： boniu@itcast.cn ， \n" +
                "       座机电话： 01056517895 ， 010 · 98951256 \n "+
                "       邮箱： bozai@itcast.cn ， \n" +
                "       邮箱： d1ei0009@163.com ， \n" +
                "       热线电话： 400-618-9090 ， 400-618-4000 ， 4006184000 ， 4006189090 ";


        String regex="(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})" +
                "|\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}" +
                "|(400-?\\d{3,7}-?\\d{3,7})";

       Pattern pattern =Pattern.compile(regex);
       //使用正则表达式创建一个模式对象。

        Matcher matcher=pattern.matcher(data);
        //使用模式对象创建一个匹配器对象，该匹配器将应用于提供的数据字符串。


        while (matcher.find()){
            String rs=matcher.group();//在每次找到匹配项时，使用 group() 方法获取匹配的具体内容。
            System.out.println(rs);
        }

    }




    public static void method1(){
        String rs="科比布莱恩特ai8888999迈克尔乔丹aa55亚历山大fbbfsfs2425欧神仙";
        System.out.println(rs.replaceAll("\\w+", "-"));

        String s="我我我喜欢编编编编编编编编编程程程";
        System.out.println(s.replaceAll("(.)\\1+", "$1"));
        /*

        (.) 是一个捕获组，表示匹配任意单个字符，并将其存储在这个组中。
          \\1 是回溯引用，指的是引用第一个捕获组中的内容。

          因此，整个正则表达式的含义是匹配一个字符，
          然后通过引用第一个捕获组中的相同字符（重复的部分），再加上 + 表示匹配一次或多次这个重复的部分。

        $1:这是替换字符串中的引用，表示将捕获组中的内容替换为原始字符串中相应位置的字符。

        $ 在Java正则表达式中具有行尾匹配和回溯引用的双重作用。
        *
        */


        String s2="科比布莱恩特ai8888999迈克尔乔丹aa55亚历山大fbbfsfs2425欧神仙";
        String []split1=s2.split("\\w+");
        System.out.println(Arrays.toString(split1));

    }

}

