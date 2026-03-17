class PlayStore {

    int storeId;
    String storeName;

    Application application;
	
	public PlayStore(int storeId , String storeName){
		this.storeId = storeId;
		this.storeName = storeName;
	}
	

    public void getPlayStoreDetail(){

        System.out.println("--------------------------------");
        System.out.println("PlayStore Details");
        System.out.println("Store Id: " + storeId);
        System.out.println("Store Name: " + storeName);

        this.application.getApplicationDetail();

    }
}