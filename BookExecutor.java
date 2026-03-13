class BookExecutor {

    public static void main(String[] args) {

        Book b1 = new Book(101,350);
        System.out.println("The book id is " + b1.id);
        System.out.println("The book pages are " + b1.pages);

        Book b2 = new Book(499.5,0.7);
        System.out.println("The book price is " + b2.price);
        System.out.println("The book weight is " + b2.weight);

        Book b3 = new Book("Java Programming","James Gosling","Oracle Press");
        System.out.println("The book title is " + b3.title);
        System.out.println("The book author is " + b3.author);
        System.out.println("The book publisher is " + b3.publisher);

        Book b4 = new Book(true,true);
        System.out.println("The book hardcover status is " + b4.hardcover);
        System.out.println("The book availability is " + b4.available);

        Book b5 = new Book('A');
        System.out.println("The book edition is " + b5.edition);

        Book b6 = new Book(9780134685991L);
        System.out.println("The book ISBN is " + b6.isbn);

        Book b7 = new Book(15.5f);
        System.out.println("The book discount is " + b7.discount);

    }
}