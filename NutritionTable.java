class NutritionTable{
	private int itemId;
	private String foodName;
	private String calories;
	private String protein;
	private String carbs;
	private String fat;
	private String status;

	public void setItemId(int itemId){
		this.itemId=itemId;
	}
	public int getItemId(){
		return this.itemId;
	}

	public void setFoodName(String foodName){
		this.foodName=foodName;
	}
	public String getFoodName(){
		return this.foodName;
	}

	public void setCalories(String calories){
		this.calories=calories;
	}
	public String getCalories(){
		return this.calories;
	}

	public void setProtein(String protein){
		this.protein=protein;
	}
	public String getProtein(){
		return this.protein;
	}

	public void setCarbs(String carbs){
		this.carbs=carbs;
	}
	public String getCarbs(){
		return this.carbs;
	}

	public void setFat(String fat){
		this.fat=fat;
	}
	public String getFat(){
		return this.fat;
	}

	public void setStatus(String status){
		this.status=status;
	}
	public String getStatus(){
		return this.status;
	}

	public void printDetails(){
		System.out.println("Item Id: "+this.itemId);
		System.out.println("Food Name: "+this.foodName);
		System.out.println("Calories: "+this.calories);
		System.out.println("Protein: "+this.protein);
		System.out.println("Carbs: "+this.carbs);
		System.out.println("Fat: "+this.fat);
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
	}
}