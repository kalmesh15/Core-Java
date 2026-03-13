class MovieExecutor {

    public static void main(String[] args) {

        Movie m1 = new Movie(1101,150);
        System.out.println("The movie id is " + m1.movieId);
        System.out.println("The movie duration in minutes is " + m1.durationMinutes);

        Movie m2 = new Movie(250000000.5,4.7);
        System.out.println("The movie budget is " + m2.budget);
        System.out.println("The movie rating score is " + m2.ratingScore);

        Movie m3 = new Movie("KGF","Prashanth Neel","Action");
        System.out.println("The movie title is " + m3.movieTitle);
        System.out.println("The movie director name is " + m3.directorName);
        System.out.println("The movie genre is " + m3.genre);

        Movie m4 = new Movie(true,true);
        System.out.println("The movie released status is " + m4.released);
        System.out.println("The subtitles availability is " + m4.subtitlesAvailable);

        Movie m5 = new Movie('A');
        System.out.println("The movie grade is " + m5.movieGrade);

        Movie m6 = new Movie(667788990011L);
        System.out.println("The movie code is " + m6.movieCode);

        Movie m7 = new Movie(250.5f);
        System.out.println("The movie ticket price is " + m7.ticketPrice);

    }
}