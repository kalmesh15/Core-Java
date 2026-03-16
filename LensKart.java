class LensKart {

    int shopId;
    String shopLocation;

    Frame frame;

    public void getLensKartDetail(){

        System.out.println("--------------------------------");
        System.out.println("LensKart Details");
        System.out.println("Shop Id: " + this.shopId);
        System.out.println("Shop Location: " + this.shopLocation);

        this.frame.getFrameDetail();

    }
}