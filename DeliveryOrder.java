class DeliveryOrder {

    int orderId;
    int itemCount;

    double orderAmount;
    double deliveryFee;

    String customerName;
    String deliveryAddress;
    String deliveryPartner;

    boolean orderPacked;
    boolean outForDelivery;

    char orderPriority;

    long trackingNumber;

    float deliveryTime;

    DeliveryOrder(int orderId, int itemCount){
        this.orderId = orderId;
        this.itemCount = itemCount;
    }

    DeliveryOrder(double orderAmount, double deliveryFee){
        this.orderAmount = orderAmount;
        this.deliveryFee = deliveryFee;
    }

    DeliveryOrder(String customerName, String deliveryAddress, String deliveryPartner){
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryPartner = deliveryPartner;
    }

    DeliveryOrder(boolean orderPacked, boolean outForDelivery){
        this.orderPacked = orderPacked;
        this.outForDelivery = outForDelivery;
    }

    DeliveryOrder(char orderPriority){
        this.orderPriority = orderPriority;
    }

    DeliveryOrder(long trackingNumber){
        this.trackingNumber = trackingNumber;
    }

    DeliveryOrder(float deliveryTime){
        this.deliveryTime = deliveryTime;
    }

}