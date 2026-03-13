class Library {

    int libraryId;
    int totalBooks;

    double membershipFee;
    double ratingScore;

    String libraryName;
    String city;
    String sectionType;

    boolean digitalAccess;
    boolean readingRoomAvailable;

    char libraryGrade;

    long registrationNumber;

    float lateFee;

    Library(int libraryId, int totalBooks){
        this.libraryId = libraryId;
        this.totalBooks = totalBooks;
    }

    Library(double membershipFee, double ratingScore){
        this.membershipFee = membershipFee;
        this.ratingScore = ratingScore;
    }

    Library(String libraryName, String city, String sectionType){
        this.libraryName = libraryName;
        this.city = city;
        this.sectionType = sectionType;
    }

    Library(boolean digitalAccess, boolean readingRoomAvailable){
        this.digitalAccess = digitalAccess;
        this.readingRoomAvailable = readingRoomAvailable;
    }

    Library(char libraryGrade){
        this.libraryGrade = libraryGrade;
    }

    Library(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    Library(float lateFee){
        this.lateFee = lateFee;
    }

}