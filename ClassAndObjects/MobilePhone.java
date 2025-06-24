public class MobilePhone {
    String brand;
    String model;
    double price;

    
    public MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

  
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S21", 69999.0);
        phone.displayPhoneDetails();
    }
}
