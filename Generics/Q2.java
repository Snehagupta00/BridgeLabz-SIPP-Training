import java.util.*;

enum BookCategory {
    FICTION, NON_FICTION, EDUCATIONAL
}

enum ClothingCategory {
    MEN, WOMEN, KIDS
}

enum GadgetCategory {
    MOBILE, LAPTOP, ACCESSORY
}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (" + category + ") - ₹" + String.format("%.2f", price);
    }
}

class DiscountUtils {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

class Catalog {
    private List<Product<?>> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Product<BookCategory> book = new Product<>("Java Programming", 499.0, BookCategory.EDUCATIONAL);
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 999.0, ClothingCategory.MEN);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000.0, GadgetCategory.MOBILE);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Catalog before discount:");
        catalog.showCatalog();

        DiscountUtils.applyDiscount(book, 10);
        DiscountUtils.applyDiscount(shirt, 20);
        DiscountUtils.applyDiscount(phone, 15);

        System.out.println("\nCatalog after discount:");
        catalog.showCatalog();
    }
}
