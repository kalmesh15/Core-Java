class Hardware {

    int hardwareId;
    String hardwareName;
    String brand;
    int price;

    public void getHardwareDetail(){

        System.out.println("Hardware Details");
        System.out.println("Hardware Id: " + this.hardwareId);
        System.out.println("Hardware Name: " + this.hardwareName);
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);

    }
}