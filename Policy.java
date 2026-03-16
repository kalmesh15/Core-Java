class Policy {

    int policyId;
    String policyName;
    String department;

    public void getPolicyDetail(){

        System.out.println("Policy Details");
        System.out.println("Policy Id: " + this.policyId);
        System.out.println("Policy Name: " + this.policyName);
        System.out.println("Department: " + this.department);

    }
}