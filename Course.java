class Course {

    int courseId;
    int durationMonths;

    double courseFee;
    double ratingScore;

    String courseName;
    String instructorName;
    String instituteName;

    boolean onlineAvailable;
    boolean certificateProvided;

    char courseLevel;

    long courseCode;

    float discount;

    Course(int courseId, int durationMonths){
        this.courseId = courseId;
        this.durationMonths = durationMonths;
    }

    Course(double courseFee, double ratingScore){
        this.courseFee = courseFee;
        this.ratingScore = ratingScore;
    }

    Course(String courseName, String instructorName, String instituteName){
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.instituteName = instituteName;
    }

    Course(boolean onlineAvailable, boolean certificateProvided){
        this.onlineAvailable = onlineAvailable;
        this.certificateProvided = certificateProvided;
    }

    Course(char courseLevel){
        this.courseLevel = courseLevel;
    }

    Course(long courseCode){
        this.courseCode = courseCode;
    }

    Course(float discount){
        this.discount = discount;
    }

}