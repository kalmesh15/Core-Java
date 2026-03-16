class Service {

    int serviceId;
    String serviceName;
    int price;
    int duration;

    public void getServiceDetail(){

        System.out.println("Service Details");
        System.out.println("Service Id: " + this.serviceId);
        System.out.println("Service Name: " + this.serviceName);
        System.out.println("Price: " + this.price);
        System.out.println("Duration: " + this.duration + " minutes");

    }
}