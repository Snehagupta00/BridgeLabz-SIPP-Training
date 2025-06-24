public class Item {
    int itemCode;
    String itemName;
    double price;

    
    public Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

   
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: ₹" + price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Notebook", 45.0);
        item.displayItemDetails();
        int quantity = 5;
        System.out.println("Total cost for " + quantity + " units: ₹" + item.calculateTotalCost(quantity));
    }
}
