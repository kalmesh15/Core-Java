class OrderDetails{
	private int orderId;
	private String productName;
	private String quantity;
	private String price;
	private String orderDate;
	private String deliveryDate;
	private String status;

	public void setOrderId(int orderId){
		this.orderId=orderId;
	}
	public int getOrderId(){
		return this.orderId;
	}

	public void setProductName(String productName){
		this.productName=productName;
	}
	public String getProductName(){
		return this.productName;
	}

	public void setQuantity(String quantity){
		this.quantity=quantity;
	}
	public String getQuantity(){
		return this.quantity;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return this.price;
	}

	public void setOrderDate(String orderDate){
		this.orderDate=orderDate;
	}
	public String getOrderDate(){
		return this.orderDate;
	}

	public void setDeliveryDate(String deliveryDate){
		this.deliveryDate=deliveryDate;
	}
	public String getDeliveryDate(){
		return this.deliveryDate;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Order Id: " + this.orderId);
		System.out.println("Product: " + this.productName);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Price: " + this.price);
		System.out.println("Order Date: " + this.orderDate);
		System.out.println("Delivery Date: " + this.deliveryDate);
		System.out.println("Status: " + this.status);
		System.out.println("-----------------------------");
	}
}