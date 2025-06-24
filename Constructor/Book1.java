public class Book1 {

    String title;
    String author;
    double price;

    // Default Constructor
    public Book1(){
        title = "unknown";
        author = "unknown";
        price = 0.0;
    }

    // Parameterized
    public Book1(String title, String author, double price){
        this.title = title;
        this.author= author;
        this.price = price;
    }

    public  void display(){
         System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("Price :" + price);
    }

    public static void main(String[] args) {
// Creating object using default constructor
        Book1 book1 = new Book1();
        System.out.println("Book 1 (Default Constructor):");
        book1.display();

// Creating object using parameterized constructor
        Book1 book2 = new Book1("Java Programming", "James Gosling", 450.75);
        System.out.println("Book 2 (Parameterized Constructor):");
        book2.display();

    }


}
