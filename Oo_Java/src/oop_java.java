public class oop_java
{
    public static void main(String [] args)
    {
        Movie movie=new Movie("gh",23,"ef",4,24);
        movie.printing();
        movie.FIND(24);

        Movie movie1 = new Movie("电影A", 8.5, "导演A", 1000000, 1);
        Movie movie2 = new Movie("电影B", 7.9, "导演B", 800000, 2);
        Movie movie3 = new Movie("电影C", 9.2, "导演C", 1200000, 3);

        Movie[] moviesArray = {movie1, movie2, movie3};

        Movies movies = new Movies(moviesArray);

        System.out.println("打印所有电影信息：");
        movies.moviesoprator();

        System.out.println("\n查找并打印指定id的电影信息：");
        movies.FINDING(2);
        movies.FINDING(5);
    }
}






