class Company {

    int companyId;
    String companyName;

    Project project;

    public void getCompanyDetail(){

        System.out.println("--------------------------------");
        System.out.println("Company Details");
        System.out.println("Company Id: " + this.companyId);
        System.out.println("Company Name: " + this.companyName);

        this.project.getProjectDetail();

    }
}