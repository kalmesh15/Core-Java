class Pc {

    int pcId;
    String pcName;

    Hardware hardware;

    public void getPcDetail(){

        System.out.println("--------------------------------");
        System.out.println("PC Details");
        System.out.println("PC Id: " + this.pcId);
        System.out.println("PC Name: " + this.pcName);

        this.hardware.getHardwareDetail();

    }
}