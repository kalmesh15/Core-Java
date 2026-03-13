class Book {

    int id;
    int pages;

    double price;
    double weight;

    String title;
    String author;
    String publisher;

    boolean hardcover;
    boolean available;

    char edition;

    long isbn;

    float discount;

    Book(int id, int pages){
        this.id = id;
        this.pages = pages;
    }

    Book(double price, double weight){
        this.price = price;
        this.weight = weight;
    }

    Book(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    Book(boolean hardcover, boolean available){
        this.hardcover = hardcover;
        this.available = available;
    }

    Book(char edition){
        this.edition = edition;
    }

    Book(long isbn){
        this.isbn = isbn;
    }

    Book(float discount){
        this.discount = discount;
    }

}