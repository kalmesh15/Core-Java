class InsurancePolicy {

    int policyId;
    int policyTermYears;

    double premiumAmount;
    double coverageAmount;

    String policyHolderName;
    String insuranceCompany;
    String policyType;

    boolean activePolicy;
    boolean accidentalCoverage;

    char policyGrade;

    long policyNumber;

    float claimPercentage;

    InsurancePolicy(int policyId, int policyTermYears){
        this.policyId = policyId;
        this.policyTermYears = policyTermYears;
    }

    InsurancePolicy(double premiumAmount, double coverageAmount){
        this.premiumAmount = premiumAmount;
        this.coverageAmount = coverageAmount;
    }

    InsurancePolicy(String policyHolderName, String insuranceCompany, String policyType){
        this.policyHolderName = policyHolderName;
        this.insuranceCompany = insuranceCompany;
        this.policyType = policyType;
    }

    InsurancePolicy(boolean activePolicy, boolean accidentalCoverage){
        this.activePolicy = activePolicy;
        this.accidentalCoverage = accidentalCoverage;
    }

    InsurancePolicy(char policyGrade){
        this.policyGrade = policyGrade;
    }

    InsurancePolicy(long policyNumber){
        this.policyNumber = policyNumber;
    }

    InsurancePolicy(float claimPercentage){
        this.claimPercentage = claimPercentage;
    }

}