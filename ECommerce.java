class ECommerce {

    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String productName) {
        boolean isAdded = false;

        if(productName != null && !productName.isEmpty()) {
            if(index < this.productNames.length) {
                this.productNames[index++] = productName;
                isAdded = true;
            } else {
                System.out.println("The product list is full. Cannot add more products.");
            }
        } else {
            System.out.println("Please enter a valid product name.");
        }

        return isAdded;
    }

    public void getProducts() {
        System.out.println("\n------------------------------------------");
        System.out.println("Displaying the list of available products");
        System.out.println("------------------------------------------");

        for(String product : productNames) {
            System.out.println("Product Name: " + product);
        }

        System.out.println("------------------------------------------\n");
    }

    public void deleteProduct(int index) {
        System.out.println("Deleting the product at index: " + index);
        productNames[index] = null;
    }

    public void updateProduct(int index, String name) {
        if(name != null && !name.isEmpty()) {
            System.out.println("Updating the product at index: " + index);
            productNames[index] = name;
        } else {
            System.out.println("Please enter a valid product name.");
        }
    }
}