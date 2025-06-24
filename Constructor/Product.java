public class Product {
    String productName;
    double price;

     static int totalProducts=0;

     public Product(String productName,double price){
         this.productName=productName;
         this.price = price;
         totalProducts++;
     }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : ₹" + price);
    }

    // Class Method to display total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating product objects
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Keyboard", 1500.0);

        // Display each product's details
        System.out.println("Product 1:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2:");
        p2.displayProductDetails();

        System.out.println("\nProduct 3:");
        p3.displayProductDetails();

        System.out.println("\n-----------------------------\n");

        // Display total products created
        Product.displayTotalProducts();
    }

}

