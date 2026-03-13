class StudentExecutor {

    public static void main(String[] args) {

        Student s1 = new Student(101,20);
        System.out.println("The student id is " + s1.id);
        System.out.println("The student age is " + s1.age);

        Student s2 = new Student(8.5,170.2);
        System.out.println("The student CGPA is " + s2.cgpa);
        System.out.println("The student height is " + s2.height);

        Student s3 = new Student("Rahul","Computer Science","MCE Hassan");
        System.out.println("The student name is " + s3.name);
        System.out.println("The student department is " + s3.department);
        System.out.println("The student college is " + s3.college);

        Student s4 = new Student(true,false);
        System.out.println("The student hostel status is " + s4.hostelStudent);
        System.out.println("The student scholarship status is " + s4.scholarshipHolder);

        Student s5 = new Student('A');
        System.out.println("The student section is " + s5.section);

        Student s6 = new Student(2024012345L);
        System.out.println("The student registration number is " + s6.registrationNumber);

        Student s7 = new Student(92.5f);
        System.out.println("The student attendance percentage is " + s7.attendance);

    }
}