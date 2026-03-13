class LibraryExecutor {

    public static void main(String[] args) {

        Library l1 = new Library(501,50000);
        System.out.println("The library id is " + l1.libraryId);
        System.out.println("The total books in the library are " + l1.totalBooks);

        Library l2 = new Library(250.5,4.6);
        System.out.println("The library membership fee is " + l2.membershipFee);
        System.out.println("The library rating score is " + l2.ratingScore);

        Library l3 = new Library("City Central Library","Mysore","Science");
        System.out.println("The library name is " + l3.libraryName);
        System.out.println("The library city is " + l3.city);
        System.out.println("The library section type is " + l3.sectionType);

        Library l4 = new Library(true,true);
        System.out.println("The library digital access availability is " + l4.digitalAccess);
        System.out.println("The reading room availability is " + l4.readingRoomAvailable);

        Library l5 = new Library('A');
        System.out.println("The library grade is " + l5.libraryGrade);

        Library l6 = new Library(998877665544L);
        System.out.println("The library registration number is " + l6.registrationNumber);

        Library l7 = new Library(2.5f);
        System.out.println("The library late fee is " + l7.lateFee);

    }
}