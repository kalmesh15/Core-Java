class ShoppingCartExecutor {

    public static void main(String[] args) {

        ShoppingCart c1 = new ShoppingCart(1401,5);
        System.out.println("The cart id is " + c1.cartId);
        System.out.println("The total items in the cart are " + c1.totalItems);

        ShoppingCart c2 = new ShoppingCart(2500.5,200.5);
        System.out.println("The total cart price is " + c2.totalPrice);
        System.out.println("The discount amount is " + c2.discountAmount);

        ShoppingCart c3 = new ShoppingCart("Anita Sharma","Credit Card","Bangalore");
        System.out.println("The customer name is " + c3.customerName);
        System.out.println("The payment method is " + c3.paymentMethod);
        System.out.println("The delivery address is " + c3.deliveryAddress);

        ShoppingCart c4 = new ShoppingCart(true,true);
        System.out.println("The payment completed status is " + c4.paymentCompleted);
        System.out.println("The delivery requested status is " + c4.deliveryRequested);

        ShoppingCart c5 = new ShoppingCart('A');
        System.out.println("The cart status is " + c5.cartStatus);

        ShoppingCart c6 = new ShoppingCart(998877665544L);
        System.out.println("The order number is " + c6.orderNumber);

        ShoppingCart c7 = new ShoppingCart(150.5f);
        System.out.println("The tax amount is " + c7.taxAmount);

    }
}