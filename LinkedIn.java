class LinkedIn {

    int linkedInId;
    String companyName;

    Profile profile;

    public void getLinkedInDetail() {

        System.out.println("--------------------------------");
        System.out.println("LinkedIn Details");
        System.out.println("LinkedIn Id: " + this.linkedInId);
        System.out.println("Company Name: " + this.companyName);

        this.profile.getProfileDetail();
    }
}