package Generics;

import java.util.ArrayList;
import java.util.List;

// Abstract class for all warehouse items
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDetails();

    @Override
    public String toString() {
        return getName() + " - " + getDetails();
    }
}

// Electronics class
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return "Electronics by " + brand;
    }
}

// Groceries class
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate) {
        super(name);
        this.expiryDate = expiryDate;
    }

    @Override
    public String getDetails() {
        return "Expires on " + expiryDate;
    }
}

// Furniture class
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    @Override
    public String getDetails() {
        return "Made of " + material;
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility class for displaying items
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Phone", "Samsung"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Milk", "2025-08-10"));
        groceriesStorage.addItem(new Groceries("Bread", "2025-07-25"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
