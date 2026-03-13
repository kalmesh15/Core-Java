class Hospital {

    int hospitalId;
    int totalBeds;

    double consultationFee;
    double ratingScore;

    String hospitalName;
    String city;
    String specialization;

    boolean emergencyService;
    boolean ambulanceService;

    char hospitalGrade;

    long licenseNumber;

    float averageWaitingTime;

    Hospital(int hospitalId, int totalBeds){
        this.hospitalId = hospitalId;
        this.totalBeds = totalBeds;
    }

    Hospital(double consultationFee, double ratingScore){
        this.consultationFee = consultationFee;
        this.ratingScore = ratingScore;
    }

    Hospital(String hospitalName, String city, String specialization){
        this.hospitalName = hospitalName;
        this.city = city;
        this.specialization = specialization;
    }

    Hospital(boolean emergencyService, boolean ambulanceService){
        this.emergencyService = emergencyService;
        this.ambulanceService = ambulanceService;
    }

    Hospital(char hospitalGrade){
        this.hospitalGrade = hospitalGrade;
    }

    Hospital(long licenseNumber){
        this.licenseNumber = licenseNumber;
    }

    Hospital(float averageWaitingTime){
        this.averageWaitingTime = averageWaitingTime;
    }

}