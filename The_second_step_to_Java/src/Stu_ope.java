import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stu_ope implements Studnet_op
{
    @Override
    public void Printstu(ArrayList<Stu> cla_list)
    {
        int count=0;
        System.out.println("-------------------------------------Students information as follow----------------------------------");
        for (int i = 0; i < cla_list.size(); i++) {
            Stu temp=cla_list.get(i);
            System.out.println("Name: "+temp.getName()+"  Sex: "+temp.getSex()+"  Score: "+temp.getScore());
            if(temp.getSex().equals("man")) count++;
        }
        System.out.println("There are "+count+" men and "+(cla_list.size()-count)+" women !");
    }



    @Override
    public double Print_avg_score(ArrayList<Stu> cla_list)
    {
        List<Double> scores = cla_list.stream()
                .map(Stu::getScore)
                .toList();

        // Calculate the average score
        double averageScore = scores.stream()
                .skip(1)
                .limit(scores.size() - 2)
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        return averageScore;
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