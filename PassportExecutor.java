class PassportExecutor {

    public static void main(String[] args) {

        Passport p1 = new Passport(1701,2024);
        System.out.println("The passport id is " + p1.passportId);
        System.out.println("The passport issue year is " + p1.issueYear);

        Passport p2 = new Passport(3500.5,10);
        System.out.println("The passport processing fee is " + p2.processingFee);
        System.out.println("The passport validity years are " + p2.validityYears);

        Passport p3 = new Passport("Arjun Kumar","Indian","India");
        System.out.println("The passport holder name is " + p3.holderName);
        System.out.println("The passport nationality is " + p3.nationality);
        System.out.println("The passport issuing country is " + p3.issuingCountry);

        Passport p4 = new Passport(true,true);
        System.out.println("The passport biometric availability is " + p4.biometric);
        System.out.println("The passport active status is " + p4.activeStatus);

        Passport p5 = new Passport('N');
        System.out.println("The passport category is " + p5.passportCategory);

        Passport p6 = new Passport(123456789012L);
        System.out.println("The passport number is " + p6.passportNumber);

        Passport p7 = new Passport(1500.5f);
        System.out.println("The passport renewal fee is " + p7.renewalFee);

    }
}