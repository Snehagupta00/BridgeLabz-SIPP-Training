public class Book {
    String title;
    String author;
    double price;

   
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

  
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.00);
        book.displayBookDetails();
    }
}
