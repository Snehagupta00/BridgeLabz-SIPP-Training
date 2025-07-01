package Inheritance;

// Superclass
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car | Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    double loadCapacity; // in tons

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck | Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasHelmetStorage;

    Motorcycle(int maxSpeed, String fuelType, boolean hasHelmetStorage) {
        super(maxSpeed, fuelType);
        this.hasHelmetStorage = hasHelmetStorage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle | Helmet Storage: " + (hasHelmetStorage ? "Yes" : "No"));
    }
}





public class VehicleMain {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 8.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        System.out.println("=== Vehicle Details ===");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}