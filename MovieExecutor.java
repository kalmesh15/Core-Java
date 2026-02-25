class MovieExecutor{
    public static void main(String[] args){

        boolean isMovieCreate;

        isMovieCreate = Movie.createMovie("Kantara","Rishab","Hombale","Kannada","Action","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie(null,"Rishab","Hombale","Kannada","Action","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","","Hombale","Kannada","Action","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","Rishab","","Kannada","Action","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","Rishab","Hombale","","Action","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","Rishab","Hombale","Kannada","","150min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","Rishab","Hombale","Kannada","Action","","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Kantara","Rishab","Hombale","Kannada","Action","150min","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("","","","","","","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie(null,null,null,null,null,null,null);
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("KGF","Prashanth","Hombale","Kannada","Action","160min","2018");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("RRR","Rajamouli","DVV","Telugu","Action","180min","2022");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Leo","Lokesh","Seven","Tamil","Action","150min","2023");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Jailer","Nelson","Sun","Tamil","Drama","140min","2023");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("","","Action","","","","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie(null,"","","","",null,"");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Pushpa","Sukumar","Mythri","Telugu","Action","160min","2021");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Salaar","Prashanth","Hombale","Kannada","Action","170min","2023");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("",null,"","","","","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Movie","Dir","","Lang","","","Year");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie(null,null,"","","","","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Test","Test","Test","Test","Test","Test","Test");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("","","",null,"","","");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie(null,"Test","Test","Test","Test","Test","Test");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

        isMovieCreate = Movie.createMovie("Film","Dir","Prod","Lang","Genre","Time","Year");
        if(isMovieCreate){
            Movie.getMovieDetails();
        }else{
            System.out.println("wrong credentials............");
        }

    }
}