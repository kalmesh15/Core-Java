class CompanyExecutor {

    public static void main(String[] args) {

        Company c1 = new Company(801,5000);
        System.out.println("The company id is " + c1.companyId);
        System.out.println("The total employees in the company are " + c1.totalEmployees);

        Company c2 = new Company(15000000.5,50000000.5);
        System.out.println("The company annual revenue is " + c2.annualRevenue);
        System.out.println("The company market value is " + c2.marketValue);

        Company c3 = new Company("Infosys","Bangalore","Salil Parekh");
        System.out.println("The company name is " + c3.companyName);
        System.out.println("The company headquarters is " + c3.headquarters);
        System.out.println("The CEO of the company is " + c3.ceoName);

        Company c4 = new Company(true,true);
        System.out.println("The company public status is " + c4.publicCompany);
        System.out.println("The company multinational status is " + c4.multinational);

        Company c5 = new Company('A');
        System.out.println("The company rating is " + c5.companyRating);

        Company c6 = new Company(12345678901L);
        System.out.println("The company registration number is " + c6.registrationNumber);

        Company c7 = new Company(1450.5f);
        System.out.println("The company stock price is " + c7.stockPrice);

    }
}