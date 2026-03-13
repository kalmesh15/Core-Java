class DeliveryOrderExecutor {

    public static void main(String[] args) {

        DeliveryOrder d1 = new DeliveryOrder(1501,3);
        System.out.println("The order id is " + d1.orderId);
        System.out.println("The item count in the order is " + d1.itemCount);

        DeliveryOrder d2 = new DeliveryOrder(1200.5,50.5);
        System.out.println("The order amount is " + d2.orderAmount);
        System.out.println("The delivery fee is " + d2.deliveryFee);

        DeliveryOrder d3 = new DeliveryOrder("Kiran","Mysore","Swiggy");
        System.out.println("The customer name is " + d3.customerName);
        System.out.println("The delivery address is " + d3.deliveryAddress);
        System.out.println("The delivery partner is " + d3.deliveryPartner);

        DeliveryOrder d4 = new DeliveryOrder(true,false);
        System.out.println("The order packed status is " + d4.orderPacked);
        System.out.println("The out for delivery status is " + d4.outForDelivery);

        DeliveryOrder d5 = new DeliveryOrder('H');
        System.out.println("The order priority is " + d5.orderPriority);

        DeliveryOrder d6 = new DeliveryOrder(112233445566L);
        System.out.println("The tracking number is " + d6.trackingNumber);

        DeliveryOrder d7 = new DeliveryOrder(30.5f);
        System.out.println("The delivery time in minutes is " + d7.deliveryTime);

    }
}