class Groww {

    int growwId;
    String platformName;

    Stock stock;

    public void getGrowwDetail(){

        System.out.println("--------------------------------");
        System.out.println("Groww Platform Details");
        System.out.println("Platform Id: " + this.growwId);
        System.out.println("Platform Name: " + this.platformName);

        this.stock.getStockDetail();

    }
}