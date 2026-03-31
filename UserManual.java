class UserManual{
	private int manualId;
	private String title;
	private String productName;
	private String version;
	private String author;
	private String publishedDate;
	private String language;

	public void setManualId(int manualId){
		this.manualId=manualId;
	}
	public int getManualId(){
		return this.manualId;
	}

	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return this.title;
	}

	public void setProductName(String productName){
		this.productName=productName;
	}
	public String getProductName(){
		return this.productName;
	}

	public void setVersion(String version){
		this.version=version;
	}
	public String getVersion(){
		return this.version;
	}

	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return this.author;
	}

	public void setPublishedDate(String publishedDate){
		this.publishedDate=publishedDate;
	}
	public String getPublishedDate(){
		return this.publishedDate;
	}

	public void setLanguage(String language){
		this.language=language;
	}
	public String getLanguage(){
		return this.language;
	}

	public void printDetails(){
		System.out.println("Manual Id: "+this.manualId);
		System.out.println("Title: "+this.title);
		System.out.println("Product Name: "+this.productName);
		System.out.println("Version: "+this.version);
		System.out.println("Author: "+this.author);
		System.out.println("Published Date: "+this.publishedDate);
		System.out.println("Language: "+this.language);
		System.out.println("----------------------");
	}
}