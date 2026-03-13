class ShoppingCart {

    int cartId;
    int totalItems;

    double totalPrice;
    double discountAmount;

    String customerName;
    String paymentMethod;
    String deliveryAddress;

    boolean paymentCompleted;
    boolean deliveryRequested;

    char cartStatus;

    long orderNumber;

    float taxAmount;

    ShoppingCart(int cartId, int totalItems){
        this.cartId = cartId;
        this.totalItems = totalItems;
    }

    ShoppingCart(double totalPrice, double discountAmount){
        this.totalPrice = totalPrice;
        this.discountAmount = discountAmount;
    }

    ShoppingCart(String customerName, String paymentMethod, String deliveryAddress){
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.deliveryAddress = deliveryAddress;
    }

    ShoppingCart(boolean paymentCompleted, boolean deliveryRequested){
        this.paymentCompleted = paymentCompleted;
        this.deliveryRequested = deliveryRequested;
    }

    ShoppingCart(char cartStatus){
        this.cartStatus = cartStatus;
    }

    ShoppingCart(long orderNumber){
        this.orderNumber = orderNumber;
    }

    ShoppingCart(float taxAmount){
        this.taxAmount = taxAmount;
    }

}