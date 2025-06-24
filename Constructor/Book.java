public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    public Book(String title,String author,double price,boolean isAvailable){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=isAvailable;
    }

    public  void borrowBook() {
        if (isAvailable) {
            System.out.println("Book \"" + title + "\" borrowed successfully!");
            isAvailable = false;
        } else {
            System.out.println("Sorry! Book \"" + title + "\" is currently not available.");
        }
    }
        public void displayDetails() {
            System.out.println("Title      : " + title);
            System.out.println("Author     : " + author);
            System.out.println("Price      : ₹" + price);
            System.out.println("Available  : " + (isAvailable ? "Yes" : "No"));
        }

    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("Java Fundamentals", "James Gosling", 550.0, true);

        // Display book info
        System.out.println("Book Details:");
        book1.displayDetails();

        System.out.println("\nTrying to borrow the book...");
        book1.borrowBook();  // First borrow

        System.out.println("\nTrying to borrow again...");
        book1.borrowBook();  // Second borrow (should show unavailable)

        System.out.println("\nUpdated Book Info:");
        book1.displayDetails();
    }


}
