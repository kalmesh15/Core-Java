class EmployeeExecutor {

    public static void main(String[] args) {

        Employee e1 = new Employee(501,5);
        System.out.println("The employee id is " + e1.id);
        System.out.println("The employee experience years are " + e1.experienceYears);

        Employee e2 = new Employee(75000.5,175.2);
        System.out.println("The employee salary is " + e2.salary);
        System.out.println("The employee height is " + e2.height);

        Employee e3 = new Employee("Anil","Software Development","Infosys");
        System.out.println("The employee name is " + e3.name);
        System.out.println("The employee department is " + e3.department);
        System.out.println("The employee company is " + e3.company);

        Employee e4 = new Employee(true,true);
        System.out.println("The employee full time status is " + e4.fullTime);
        System.out.println("The employee remote worker status is " + e4.remoteWorker);

        Employee e5 = new Employee('B');
        System.out.println("The employee grade is " + e5.grade);

        Employee e6 = new Employee(9988776655L);
        System.out.println("The employee code is " + e6.employeeCode);

        Employee e7 = new Employee(12.5f);
        System.out.println("The employee bonus percentage is " + e7.bonusPercentage);

    }
}