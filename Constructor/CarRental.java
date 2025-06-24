import java.util.Locale;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    public CarRental() {
        customerName = "unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost

    public double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 1600.0;
                break;
            case "suv":
                ratePerDay = 1500.0;
                break;
            case "sedanann":
                ratePerDay = 600.0;
                break;
            default:
                ratePerDay = 1200.0;

        }

        return rentalDays * ratePerDay;

    }

    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Default rental
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        rental1.displayRentalDetails();

        System.out.println("\n-----------------------------\n");

        // Parameterized rental
        CarRental rental2 = new CarRental("Sneha Gupta", "SUV", 4);
        System.out.println("Rental 2 (Parameterized Constructor):");
        rental2.displayRentalDetails();
    }




}