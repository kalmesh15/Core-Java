class MedicalShop {

    int shopId;
    String shopName;
    String ownerName;
    String location;
    double totalSales;
    int numberOfMedicines;
    String openingTime;
    String closingTime;
    String licenseNumber;
    String contactNumber;
    boolean is24HoursOpen;
    boolean isHomeDeliveryAvailable;
    int rating;
    String shopType;
    String supplierName;
    String paymentMode;
    String customerType;
    double shopArea;
    String registrationAuthority;
    String storageInstructions;

    public MedicalShop() {
        this(1, "HealthCare Pharmacy", "Ravi Kumar", "Bangalore", 50000.0, 200, "8:00 AM", "10:00 PM", "LIC12345", "9876543210", false, true, 5, "Retail", "PharmaSupply Ltd", "Cash & UPI", "All", 500.0, "Govt Authority", "Store medicines at proper temperature");
    }

    public MedicalShop(int shopId, String shopName, String ownerName, String location, double totalSales, int numberOfMedicines, String openingTime, String closingTime, String licenseNumber, String contactNumber, boolean is24HoursOpen, boolean isHomeDeliveryAvailable, int rating, String shopType, String supplierName, String paymentMode, String customerType, double shopArea, String registrationAuthority, String storageInstructions) {

        this.shopId = shopId;
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.location = location;
        this.totalSales = totalSales;
        this.numberOfMedicines = numberOfMedicines;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
        this.is24HoursOpen = is24HoursOpen;
        this.isHomeDeliveryAvailable = isHomeDeliveryAvailable;
        this.rating = rating;
        this.shopType = shopType;
        this.supplierName = supplierName;
        this.paymentMode = paymentMode;
        this.customerType = customerType;
        this.shopArea = shopArea;
        this.registrationAuthority = registrationAuthority;
        this.storageInstructions = storageInstructions;
    }

    void display() {

        System.out.println("Shop ID: " + shopId);
        System.out.println("Shop Name: " + shopName);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Location: " + location);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Number Of Medicines: " + numberOfMedicines);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Is 24 Hours Open: " + is24HoursOpen);
        System.out.println("Home Delivery Available: " + isHomeDeliveryAvailable);
        System.out.println("Rating: " + rating);
        System.out.println("Shop Type: " + shopType);
        System.out.println("Supplier Name: " + supplierName);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Shop Area: " + shopArea);
        System.out.println("Registration Authority: " + registrationAuthority);
        System.out.println("Storage Instructions: " + storageInstructions);
    }
}