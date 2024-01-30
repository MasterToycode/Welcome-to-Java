import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        CreateCode c = new CreateCode();
        System.out.println(c.createcode(6));
    }
}

class CreateCode {
    public static String createcode(int n)
    {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
        {
            int type = r.nextInt(3);
            switch (type)
            {
                case 0: sb.append((r.nextInt(10))); break;
                case 1: sb.append((char)(r.nextInt(25) + 65)); break;
                case 2: sb.append((char)(r.nextInt(25) + 97)); break;
            }
        }
        return sb.toString();
    }
}
