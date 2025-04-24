package Mastery3;

/**
 * Represents a Minivan vehicle that extends the base Vehicle class.
 * Adds minivan-specific features like rear entertainment system.
 */
public class Minivan extends Vehicle {
    
    // Additional property specific to Minivan
    private final boolean hasRearEntertainmentSystem;

    /**
     * Constructs a new Minivan instance with specified properties.
     *
     * @param fuelEconomyCity            Fuel economy in city conditions (miles per gallon)
     * @param fuelEconomyHwy             Fuel economy in highway conditions (miles per gallon)
     * @param seatingCapacity            Maximum number of passengers the minivan can accommodate
     * @param cargoVolume                Available cargo space in cubic feet
     * @param hasRearEntertainmentSystem Whether the minivan has a rear entertainment system
     */
    public Minivan(double fuelEconomyCity, double fuelEconomyHwy,
                  int seatingCapacity, double cargoVolume,
                  boolean hasRearEntertainmentSystem) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
        this.hasRearEntertainmentSystem = hasRearEntertainmentSystem;
    }

    /**
     * Displays the type of vehicle (implementation of abstract method from Vehicle).
     * Prints "This is a Minivan." to standard output.
     */
    @Override
    public void displayVehicleType() {
        System.out.println("This is a Minivan.");
    }

    /**
     * Checks if the minivan has a rear entertainment system.
     *
     * @return true if the minivan has a rear entertainment system, false otherwise
     */
    public boolean hasRearEntertainmentSystem() {
        return hasRearEntertainmentSystem;
    }

    /**
     * Returns a string representation of the Minivan including all properties.
     *
     * @return String containing all vehicle properties plus minivan-specific features
     */
    @Override
    public String toString() {
        return super.toString() + 
               ", Rear Entertainment System: " + 
               (hasRearEntertainmentSystem ? "Yes" : "No");
    }
}
