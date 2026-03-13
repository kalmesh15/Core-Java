class Passport {

    int passportId;
    int issueYear;

    double processingFee;
    double validityYears;

    String holderName;
    String nationality;
    String issuingCountry;

    boolean biometric;
    boolean activeStatus;

    char passportCategory;

    long passportNumber;

    float renewalFee;

    Passport(int passportId, int issueYear){
        this.passportId = passportId;
        this.issueYear = issueYear;
    }

    Passport(double processingFee, double validityYears){
        this.processingFee = processingFee;
        this.validityYears = validityYears;
    }

    Passport(String holderName, String nationality, String issuingCountry){
        this.holderName = holderName;
        this.nationality = nationality;
        this.issuingCountry = issuingCountry;
    }

    Passport(boolean biometric, boolean activeStatus){
        this.biometric = biometric;
        this.activeStatus = activeStatus;
    }

    Passport(char passportCategory){
        this.passportCategory = passportCategory;
    }

    Passport(long passportNumber){
        this.passportNumber = passportNumber;
    }

    Passport(float renewalFee){
        this.renewalFee = renewalFee;
    }

}