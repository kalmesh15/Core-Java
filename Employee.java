class Employee {

    int id;
    int experienceYears;

    double salary;
    double height;

    String name;
    String department;
    String company;

    boolean fullTime;
    boolean remoteWorker;

    char grade;

    long employeeCode;

    float bonusPercentage;

    Employee(int id, int experienceYears){
        this.id = id;
        this.experienceYears = experienceYears;
    }

    Employee(double salary, double height){
        this.salary = salary;
        this.height = height;
    }

    Employee(String name, String department, String company){
        this.name = name;
        this.department = department;
        this.company = company;
    }

    Employee(boolean fullTime, boolean remoteWorker){
        this.fullTime = fullTime;
        this.remoteWorker = remoteWorker;
    }

    Employee(char grade){
        this.grade = grade;
    }

    Employee(long employeeCode){
        this.employeeCode = employeeCode;
    }

    Employee(float bonusPercentage){
        this.bonusPercentage = bonusPercentage;
    }

}