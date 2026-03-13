class Company {

    int companyId;
    int totalEmployees;

    double annualRevenue;
    double marketValue;

    String companyName;
    String headquarters;
    String ceoName;

    boolean publicCompany;
    boolean multinational;

    char companyRating;

    long registrationNumber;

    float stockPrice;

    Company(int companyId, int totalEmployees){
        this.companyId = companyId;
        this.totalEmployees = totalEmployees;
    }

    Company(double annualRevenue, double marketValue){
        this.annualRevenue = annualRevenue;
        this.marketValue = marketValue;
    }

    Company(String companyName, String headquarters, String ceoName){
        this.companyName = companyName;
        this.headquarters = headquarters;
        this.ceoName = ceoName;
    }

    Company(boolean publicCompany, boolean multinational){
        this.publicCompany = publicCompany;
        this.multinational = multinational;
    }

    Company(char companyRating){
        this.companyRating = companyRating;
    }

    Company(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    Company(float stockPrice){
        this.stockPrice = stockPrice;
    }

}