class Article {

    int articleId;
    String title;
    String author;
	
	public Article(int articleId,String title,String author){
		this.articleId=articleId;
		this.title=title;
		this.author=author;
		
	}

    public void getArticleDetail() {

        System.out.println("Article Details");
        System.out.println("Article Id: " + this.articleId);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);

    }
}