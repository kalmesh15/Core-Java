class PlayStore {

    int storeId;
    String storeName;

    Application application;

    public void getPlayStoreDetail(){

        System.out.println("--------------------------------");
        System.out.println("PlayStore Details");
        System.out.println("Store Id: " + this.storeId);
        System.out.println("Store Name: " + this.storeName);

        this.application.getApplicationDetail();

    }
}