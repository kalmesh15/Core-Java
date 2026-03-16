class Wonderla {

    int parkId;
    String parkLocation;

    LazyPool lazyPool;

    public void getWonderlaDetail(){

        System.out.println("--------------------------------");
        System.out.println("Wonderla Details");
        System.out.println("Park Id: " + this.parkId);
        System.out.println("Park Location: " + this.parkLocation);

        this.lazyPool.getLazyPoolDetail();

    }
}