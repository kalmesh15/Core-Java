class Movie{

    static String movieName;
    static String director;
    static String producer;
    static String language;
    static String genre;
    static String duration;
    static String releaseYear;

    public static boolean createMovie(String name, String dir, String prod, String lang, String gen, String dur, String year){

        boolean isCreateMovie = false;

        boolean isNameValid = false;
        boolean isDirectorValid = false;
        boolean isProducerValid = false;
        boolean isLanguageValid = false;
        boolean isGenreValid = false;
        boolean isDurationValid = false;
        boolean isYearValid = false;

        if(name != null && !name.isEmpty()){
            System.out.println("Movie name is valid....");
            movieName = name;
            isNameValid = true;
        }else{
            System.out.println("Movie name is not valid....");
        }

        if(dir != null && !dir.isEmpty()){
            System.out.println("Director is valid....");
            director = dir;
            isDirectorValid = true;
        }else{
            System.out.println("Director is not valid....");
        }

        if(prod != null && !prod.isEmpty()){
            System.out.println("Producer is valid....");
            producer = prod;
            isProducerValid = true;
        }else{
            System.out.println("Producer is not valid....");
        }

        if(lang != null && !lang.isEmpty()){
            System.out.println("Language is valid....");
            language = lang;
            isLanguageValid = true;
        }else{
            System.out.println("Language is not valid....");
        }

        if(gen != null && !gen.isEmpty()){
            System.out.println("Genre is valid....");
            genre = gen;
            isGenreValid = true;
        }else{
            System.out.println("Genre is not valid....");
        }

        if(dur != null && !dur.isEmpty()){
            System.out.println("Duration is valid....");
            duration = dur;
            isDurationValid = true;
        }else{
            System.out.println("Duration is not valid....");
        }

        if(year != null && !year.isEmpty()){
            System.out.println("Release year is valid....");
            releaseYear = year;
            isYearValid = true;
        }else{
            System.out.println("Release year is not valid....");
        }

        if(isNameValid && isDirectorValid && isProducerValid && isLanguageValid && isGenreValid && isDurationValid && isYearValid){
            isCreateMovie = true;
            System.out.println("All inputs are validates..................");
        }else{
            System.out.println("All inputs are not validates............");
        }

        return isCreateMovie;
    }

    public static void getMovieDetails(){
        System.out.println("......................................................");
        System.out.println("Movie details are.....");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Producer: " + producer);
        System.out.println("Language: " + language);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("......................................................");
    }
}