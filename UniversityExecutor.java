class UniversityExecutor {

    public static void main(String[] args) {

        University u1 = new University(701,20000);
        System.out.println("The university id is " + u1.universityId);
        System.out.println("The total students in the university are " + u1.totalStudents);

        University u2 = new University(9.5,250.5);
        System.out.println("The university ranking score is " + u2.rankingScore);
        System.out.println("The campus area of the university is " + u2.campusArea);

        University u3 = new University("Visvesvaraya University","Belagavi","Dr. Mahesh");
        System.out.println("The university name is " + u3.universityName);
        System.out.println("The university location is " + u3.location);
        System.out.println("The vice chancellor of the university is " + u3.viceChancellor);

        University u4 = new University(true,true);
        System.out.println("The hostel facility availability is " + u4.hostelFacility);
        System.out.println("The international programs availability is " + u4.internationalPrograms);

        University u5 = new University('A');
        System.out.println("The university grade is " + u5.universityGrade);

        University u6 = new University(98765432100L);
        System.out.println("The university registration number is " + u6.registrationNumber);

        University u7 = new University(50000.0f);
        System.out.println("The university tuition fee is " + u7.tuitionFee);

    }
}