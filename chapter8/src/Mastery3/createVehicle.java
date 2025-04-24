
package Mastery3;

/**
 * This class demonstrates the creation and usage of different vehicle types
 * (Car, Truck, Minivan) that inherit from the base Vehicle class.
 */
public class createVehicle {  // Changed to PascalCase to follow Java conventions

    /**
     * Main method that creates instances of different vehicle types
     * and demonstrates their functionality.
     *
     * @param args Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Create and demonstrate a Car
        createAndDisplayCar();
        
        // Create and demonstrate a Truck
        createAndDisplayTruck();
        
        // Create and demonstrate a Minivan
        createAndDisplayMinivan();
    }

    /**
     * Creates a Car instance and displays its properties.
     */
    private static void createAndDisplayCar() {
        Car car = new Car(25.0, 35.0, 5, 15.0, "Sedan");
        car.displayVehicleType();
        System.out.println("Car Details: " + car);
        System.out.println();  // Add empty line for better output separation
    }

    /**
     * Creates a Truck instance and displays its properties.
     */
    private static void createAndDisplayTruck() {
        Truck truck = new Truck(15.0, 20.0, 3, 30.0, 10000);
        truck.displayVehicleType();
        System.out.println("Truck Details: " + truck);
        System.out.println();
    }

    /**
     * Creates a Minivan instance and displays its properties,
     * including checking for rear entertainment system.
     */
    private static void createAndDisplayMinivan() {
        Minivan minivan = new Minivan(20.0, 28.0, 7, 40.0, true);
        minivan.displayVehicleType();
        System.out.println("Minivan Details: " + minivan);
        
        // Check for rear entertainment system
        if (minivan.hasRearEntertainmentSystem()) {
            System.out.println("This minivan is equipped with a rear entertainment system.");
        } else {
            System.out.println("This minivan does not have a rear entertainment system.");
        }
    }
}



