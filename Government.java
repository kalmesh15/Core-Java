class Government {

    int governmentId;
    String countryName;

    Policy policy;

    public void getGovernmentDetail(){

        System.out.println("--------------------------------");
        System.out.println("Government Details");
        System.out.println("Government Id: " + this.governmentId);
        System.out.println("Country Name: " + this.countryName);

        this.policy.getPolicyDetail();

    }
}