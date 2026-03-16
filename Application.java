class Application {

    int appId;
    String appName;
    String category;
    double rating;

    public void getApplicationDetail(){

        System.out.println("Application Details");
        System.out.println("Application Id: " + this.appId);
        System.out.println("Application Name: " + this.appName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);

    }
}