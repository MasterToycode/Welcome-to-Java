public class Movies
{
        private Movie moviees[];

        public Movies(Movie[] moviees)
        {
            this.moviees = moviees;
        }

        public void moviesoprator()
        {
            for (int i = 0; i < moviees.length ; i++)
            {
                moviees[i].printing();
            }
        }

        public void FINDING(double e)
        {
            int count=0;
            for (int i = 0; i < moviees.length ; i++)
            {
                if(moviees[i].FIND(e))
                {
                    moviees[i].printing();
                    count++;
                }

            }
            if(count==0) System.out.println("Wrong id");
        }
}
