class Stock {

    int stockId;
    String stockName;
    double price;
    String sector;

    public void getStockDetail(){

        System.out.println("Stock Details");
        System.out.println("Stock Id: " + this.stockId);
        System.out.println("Stock Name: " + this.stockName);
        System.out.println("Price: " + this.price);
        System.out.println("Sector: " + this.sector);

    }
}