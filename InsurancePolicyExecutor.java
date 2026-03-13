class InsurancePolicyExecutor {

    public static void main(String[] args) {

        InsurancePolicy p1 = new InsurancePolicy(1301,20);
        System.out.println("The policy id is " + p1.policyId);
        System.out.println("The policy term in years is " + p1.policyTermYears);

        InsurancePolicy p2 = new InsurancePolicy(15000.5,500000.5);
        System.out.println("The premium amount is " + p2.premiumAmount);
        System.out.println("The coverage amount is " + p2.coverageAmount);

        InsurancePolicy p3 = new InsurancePolicy("Ramesh Kumar","LIC","Life Insurance");
        System.out.println("The policy holder name is " + p3.policyHolderName);
        System.out.println("The insurance company is " + p3.insuranceCompany);
        System.out.println("The policy type is " + p3.policyType);

        InsurancePolicy p4 = new InsurancePolicy(true,true);
        System.out.println("The policy active status is " + p4.activePolicy);
        System.out.println("The accidental coverage availability is " + p4.accidentalCoverage);

        InsurancePolicy p5 = new InsurancePolicy('A');
        System.out.println("The policy grade is " + p5.policyGrade);

        InsurancePolicy p6 = new InsurancePolicy(889900112233L);
        System.out.println("The policy number is " + p6.policyNumber);

        InsurancePolicy p7 = new InsurancePolicy(90.5f);
        System.out.println("The claim percentage is " + p7.claimPercentage);

    }
}