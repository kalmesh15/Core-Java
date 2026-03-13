class Student {

    int id;
    int age;

    double cgpa;
    double height;

    String name;
    String department;
    String college;

    boolean hostelStudent;
    boolean scholarshipHolder;

    char section;

    long registrationNumber;

    float attendance;

    Student(int id, int age){
        this.id = id;
        this.age = age;
    }

    Student(double cgpa, double height){
        this.cgpa = cgpa;
        this.height = height;
    }

    Student(String name, String department, String college){
        this.name = name;
        this.department = department;
        this.college = college;
    }

    Student(boolean hostelStudent, boolean scholarshipHolder){
        this.hostelStudent = hostelStudent;
        this.scholarshipHolder = scholarshipHolder;
    }

    Student(char section){
        this.section = section;
    }

    Student(long registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    Student(float attendance){
        this.attendance = attendance;
    }

}