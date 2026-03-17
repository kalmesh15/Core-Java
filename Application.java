class Application {

    int appId;
    String appName;
    String category;
    double rating;
	
	public Application(int appId,String appName,String category,double rating){
		this.appId=appId;
		this.appName = appName;
		this.category=category;
		this.rating=rating;
	}
	

    public void getApplicationDetail(){

        System.out.println("Application Details");
        System.out.println("Application Id: " + appId);
        System.out.println("Application Name: " + appName);
        System.out.println("Category: " + category);
        System.out.println("Rating: " + rating);

    }
}