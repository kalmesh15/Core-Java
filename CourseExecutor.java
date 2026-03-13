class CourseExecutor {

    public static void main(String[] args) {

        Course c1 = new Course(601,6);
        System.out.println("The course id is " + c1.courseId);
        System.out.println("The course duration in months is " + c1.durationMonths);

        Course c2 = new Course(15000.5,4.5);
        System.out.println("The course fee is " + c2.courseFee);
        System.out.println("The course rating score is " + c2.ratingScore);

        Course c3 = new Course("Java Full Stack","Ravi Kumar","SkillAcademy");
        System.out.println("The course name is " + c3.courseName);
        System.out.println("The instructor name is " + c3.instructorName);
        System.out.println("The institute name is " + c3.instituteName);

        Course c4 = new Course(true,true);
        System.out.println("The online availability of the course is " + c4.onlineAvailable);
        System.out.println("The certificate availability is " + c4.certificateProvided);

        Course c5 = new Course('A');
        System.out.println("The course level is " + c5.courseLevel);

        Course c6 = new Course(12345678901L);
        System.out.println("The course code is " + c6.courseCode);

        Course c7 = new Course(10.5f);
        System.out.println("The course discount is " + c7.discount);

    }
}