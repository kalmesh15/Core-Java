class Mall {

    int mallId;
    String mallName;

    Shop shop;

    public void getMallDetail() {

        System.out.println("--------------------------------");
        System.out.println("Mall Details");
        System.out.println("Mall Id: " + this.mallId);
        System.out.println("Mall Name: " + this.mallName);

        this.shop.getShopDetail();
    }
}