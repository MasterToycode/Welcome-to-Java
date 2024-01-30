import java.util.*;
public class MarkScore {
    public static void main(String[] args) {
        List<Integer> score = Arrays.asList(100, 95, 96, 97, 94);
        Cal c = new Cal();
        System.out.println(c.Cal(score));
    }
}

class Cal
{
    public static double Cal(List<Integer> score)
    {
        double averageScore = score.stream()
                .skip(1)
                .limit(score.size() - 2)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        return averageScore;
    }
}