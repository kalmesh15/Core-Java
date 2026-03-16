class Movie {

    int movieId;
    String movieName;
    String director;
    int budget;

    public void getMovieDetail(){

        System.out.println("Movie Details");
        System.out.println("Movie Id: " + this.movieId);
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Director: " + this.director);
        System.out.println("Budget: " + this.budget);

    }
}