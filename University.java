class University {

    int universityId;
    int totalStudents;

    double rankingScore;
    double campusArea;

    String universityName;
    String location;
    String viceChancellor;

    boolean hostelFacility;
    boolean internationalPrograms;

    char universityGrade;

    long registrationNumber;

    float tuitionFee;

    University(int universityId, int totalStudents){
        this.universityId = universityId;
        this.totalStudents = totalStudents;
    }

    University(double rankingScore, double campusArea){
        this.rankingScore = rankingScore;
        this.campusArea = campusArea;
    }

    University(String universityName, String location, String viceChancellor){
        this.universityName = universityName;
        this.location = location;
        this.viceChancellor = viceChancellor;
    }

    University(boolean hostelFacility, boolean internationalPrograms){
        this.hostelFacility = hostelFacility;
        this.internationalPrograms = internationalPrograms;
    }

    University(char universityGrade){
        this.universityGrade = universityGrade;
    }

    University(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    University(float tuitionFee){
        this.tuitionFee = tuitionFee;
    }

}