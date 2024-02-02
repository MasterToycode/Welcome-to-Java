public class Movie
{
    private String name;
    private double score;
    private String director;
    private double person_want_to_watch;
    public double id;
    Movie(String a,double b,String c,double d,double e)
    {
        this.name=a;
        this.score=b;
        this.director=c;
        this.person_want_to_watch=d;
        this.id=e;
    }

    Movie()
    {
        this.name="\0";
        this.score=0;
        this.director="\0";
        this.person_want_to_watch=0;
        this.id=0;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public double getScore()
    {
        return score;
    }

    public void setScore(double score)
    {
        this.score = score;
    }

    public String getName_daoyan()
    {
        return director;
    }

    public void setName_daoyan(String name_daoyan) {
        this.director = name_daoyan;
    }

    public double getPerson_want_to_watch() {
        return person_want_to_watch;
    }

    public void setPerson_want_to_watch(double person_want_to_watch) {this.person_want_to_watch = person_want_to_watch;}

    public double getId() {return id;}

    public void setId(double id) {this.id = id;}

    public  void printing()
    {
        System.out.println(this.name);
        System.out.println(this.score);
        System.out.println(this.director);
        System.out.println(this.person_want_to_watch);
        System.out.println(this.id);
    }

    public boolean FIND(double e)
    {
        if(e==this.id) return true;
        else return  false;
    }

}
