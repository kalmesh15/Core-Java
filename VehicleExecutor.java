class VehicleExecutor {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(101,5);
        System.out.println("The vehicle id is " + v1.id);
        System.out.println("The vehicle seating capacity is " + v1.seatingCapacity);

        Vehicle v2 = new Vehicle(850000.5,18.5);
        System.out.println("The vehicle price is " + v2.price);
        System.out.println("The vehicle mileage is " + v2.mileage);

        Vehicle v3 = new Vehicle("Toyota","Innova","Diesel");
        System.out.println("The vehicle brand is " + v3.brand);
        System.out.println("The vehicle model is " + v3.model);
        System.out.println("The vehicle fuel type is " + v3.fuelType);

        Vehicle v4 = new Vehicle(true,false);
        System.out.println("The vehicle automatic status is " + v4.automatic);
        System.out.println("The vehicle electric status is " + v4.electric);

        Vehicle v5 = new Vehicle('A');
        System.out.println("The vehicle category is " + v5.category);

        Vehicle v6 = new Vehicle(9876543210L);
        System.out.println("The vehicle registration number is " + v6.registrationNumber);

        Vehicle v7 = new Vehicle(2.0f);
        System.out.println("The vehicle engine capacity is " + v7.engineCapacity);

    }
}