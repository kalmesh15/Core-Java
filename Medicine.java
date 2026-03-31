class Medicine{
	private int medicineId;
	private String name;
	private String type;
	private String company;
	private String manufactureDate;
	private String expiryDate;
	private String price;

	public void setMedicineId(int medicineId){
		this.medicineId=medicineId;
	}
	public int getMedicineId(){
		return this.medicineId;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return this.type;
	}

	public void setCompany(String company){
		this.company=company;
	}
	public String getCompany(){
		return this.company;
	}

	public void setManufactureDate(String manufactureDate){
		this.manufactureDate=manufactureDate;
	}
	public String getManufactureDate(){
		return this.manufactureDate;
	}

	public void setExpiryDate(String expiryDate){
		this.expiryDate=expiryDate;
	}
	public String getExpiryDate(){
		return this.expiryDate;
	}

	public void setPrice(String price){
		this.price=price;
	}
	public String getPrice(){
		return this.price;
	}

	public void printDetails(){
		System.out.println("Medicine Id: "+this.medicineId);
		System.out.println("Name: "+this.name);
		System.out.println("Type: "+this.type);
		System.out.println("Company: "+this.company);
		System.out.println("Manufacture Date: "+this.manufactureDate);
		System.out.println("Expiry Date: "+this.expiryDate);
		System.out.println("Price: "+this.price);
		System.out.println("----------------------");
	}
}