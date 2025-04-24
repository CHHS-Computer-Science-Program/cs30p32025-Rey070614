package Mastery3;

/**
 * Represents a Truck vehicle that extends the base Vehicle class.
 * Adds truck-specific capabilities like towing capacity.
 */
public class Truck extends Vehicle {
    
    // Additional property specific to Truck
    private final double towingCapacity; // in pounds

    /**
     * Constructs a new Truck instance with specified properties.
     *
     * @param fuelEconomyCity   Fuel economy in city conditions (miles per gallon)
     * @param fuelEconomyHwy    Fuel economy in highway conditions (miles per gallon)
     * @param seatingCapacity   Maximum number of passengers the truck can accommodate
     * @param cargoVolume       Available cargo space in cubic feet
     * @param towingCapacity    Maximum weight the truck can tow in pounds
     */
    public Truck(double fuelEconomyCity, double fuelEconomyHwy,
                int seatingCapacity, double cargoVolume,
                double towingCapacity) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
        this.towingCapacity = towingCapacity;
    }

    /**
     * Displays the type of vehicle (implementation of abstract method from Vehicle).
     * Prints "This is a Truck." to standard output.
     */
    @Override
    public void displayVehicleType() {
        System.out.println("This is a Truck.");
    }

    /**
     * Gets the truck's towing capacity.
     *
     * @return the maximum towing capacity in pounds
     */
    public double getTowingCapacity() {
        return towingCapacity;
    }

    /**
     * Returns a string representation of the Truck including all properties.
     *
     * @return String containing all vehicle properties plus truck-specific towing capacity
     */
    @Override
    public String toString() {
        return String.format("%s, Towing Capacity: %.1f lbs", 
                           super.toString(), 
                           towingCapacity);
    }
}