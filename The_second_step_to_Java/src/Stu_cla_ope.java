import java.util.ArrayList;

public class Stu_cla_ope
{
   private ArrayList<Stu> cla_list;
   private Stu_ope operator=new Stu_ope();

    public Stu_cla_ope(ArrayList<Stu> cla_list)
    {
      this.cla_list=(cla_list);
    }
    public Stu_cla_ope() {}


    public void Print()
    {
         operator.Printstu(cla_list);
    }

    public void avg_score(){
     System.out.println("The avg_score is "+operator.Print_avg_score(cla_list));
        System.out.println("-----------------------------------------------------------------------------------------------------");

    }
}

