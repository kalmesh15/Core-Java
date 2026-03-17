class Newspaper {

    int newspaperId;
    String newspaperName;

    Article article;
	
	public Newspaper(int newspaperId,String newspaperName,Article article){
		this.newspaperId=newspaperId;
		this.newspaperName=newspaperName;
		this.article=article;
	}

    public void getNewspaperDetail() {

        System.out.println("--------------------------------");
        System.out.println("Newspaper Details");
        System.out.println("Newspaper Id: " + this.newspaperId);
        System.out.println("Newspaper Name: " + this.newspaperName);

        this.article.getArticleDetail();
    }
}