public class Vehicle {

    String ownerName;
    String vehicleType;


    static double registrationFee = 5000.0;


    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }


    public void displayVehicleDetails() {
        System.out.println("Owner Name     : " + ownerName);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }


    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to ₹" + registrationFee);
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Sneha Gupta", "Car");
        Vehicle v2 = new Vehicle("Rahul Sharma", "Bike");

        // Display vehicle details
        System.out.println("Vehicle 1:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2:");
        v2.displayVehicleDetails();

        System.out.println("\n-----------------------------\n");

        // Update registration fee using class method
        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter Updating Registration Fee:\n");

        // Display vehicle details again to see updated fee
        System.out.println("Vehicle 1:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2:");
        v2.displayVehicleDetails();
    }
}
