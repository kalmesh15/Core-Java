class Movie {

    int movieId;
    int durationMinutes;

    double budget;
    double ratingScore;

    String movieTitle;
    String directorName;
    String genre;

    boolean released;
    boolean subtitlesAvailable;

    char movieGrade;

    long movieCode;

    float ticketPrice;

    Movie(int movieId, int durationMinutes){
        this.movieId = movieId;
        this.durationMinutes = durationMinutes;
    }

    Movie(double budget, double ratingScore){
        this.budget = budget;
        this.ratingScore = ratingScore;
    }

    Movie(String movieTitle, String directorName, String genre){
        this.movieTitle = movieTitle;
        this.directorName = directorName;
        this.genre = genre;
    }

    Movie(boolean released, boolean subtitlesAvailable){
        this.released = released;
        this.subtitlesAvailable = subtitlesAvailable;
    }

    Movie(char movieGrade){
        this.movieGrade = movieGrade;
    }

    Movie(long movieCode){
        this.movieCode = movieCode;
    }

    Movie(float ticketPrice){
        this.ticketPrice = ticketPrice;
    }

}