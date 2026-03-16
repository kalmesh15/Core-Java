class ProductionHouse {

    int houseId;
    String houseName;

    Movie movie;

    public void getProductionHouseDetail(){

        System.out.println("--------------------------------");
        System.out.println("Production House Details");
        System.out.println("House Id: " + this.houseId);
        System.out.println("House Name: " + this.houseName);

        this.movie.getMovieDetail();

    }
}