class Salon {

    int salonId;
    String salonName;

    Service service;

    public void getSalonDetail(){

        System.out.println("--------------------------------");
        System.out.println("Salon Details");
        System.out.println("Salon Id: " + this.salonId);
        System.out.println("Salon Name: " + this.salonName);

        this.service.getServiceDetail();

    }
}