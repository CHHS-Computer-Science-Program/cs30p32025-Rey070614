package Mastery3;

/**
 * An abstract base class representing a generic vehicle.
 * Provides common properties and behaviors for all vehicle types.
 * Subclasses must implement the displayVehicleType() method.
 */
public abstract class Vehicle {
    // Vehicle properties with units noted in comments
    private final double fuelEconomyCity;  // miles per gallon (mpg)
    private final double fuelEconomyHwy;   // miles per gallon (mpg)
    private final int seatingCapacity;     // number of seats
    private final double cargoVolume;      // cubic feet

    /**
     * Constructs a new Vehicle with specified properties.
     *
     * @param fuelEconomyCity   Fuel economy in city driving conditions (mpg)
     * @param fuelEconomyHwy    Fuel economy in highway driving conditions (mpg)
     * @param seatingCapacity   Maximum number of passengers the vehicle can accommodate
     * @param cargoVolume       Available cargo space in cubic feet
     * @throws IllegalArgumentException if any numeric parameter is negative
     */
    public Vehicle(double fuelEconomyCity, double fuelEconomyHwy,
                  int seatingCapacity, double cargoVolume) {
        validateParameters(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
        this.fuelEconomyCity = fuelEconomyCity;
        this.fuelEconomyHwy = fuelEconomyHwy;
        this.seatingCapacity = seatingCapacity;
        this.cargoVolume = cargoVolume;
    }

    /**
     * Validates constructor parameters to ensure they are non-negative.
     */
    private void validateParameters(double fuelEconomyCity, double fuelEconomyHwy,
                                  int seatingCapacity, double cargoVolume) {
        if (fuelEconomyCity < 0 || fuelEconomyHwy < 0 || 
            seatingCapacity < 0 || cargoVolume < 0) {
            throw new IllegalArgumentException("Vehicle parameters cannot be negative");
        }
    }

    /**
     * Abstract method to display the vehicle type.
     * Must be implemented by concrete subclasses.
     */
    public abstract void displayVehicleType();

    // Getter methods with proper documentation

    /**
     * @return the vehicle's city fuel economy in miles per gallon (mpg)
     */
    public double getFuelEconomyCity() {
        return fuelEconomyCity;
    }

    /**
     * @return the vehicle's highway fuel economy in miles per gallon (mpg)
     */
    public double getFuelEconomyHwy() {
        return fuelEconomyHwy;
    }

    /**
     * @return the vehicle's maximum seating capacity
     */
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * @return the vehicle's cargo volume in cubic feet
     */
    public double getCargoVolume() {
        return cargoVolume;
    }

    /**
     * Returns a string representation of the vehicle's common properties.
     *
     * @return formatted string containing all vehicle properties with units
     */
    @Override
    public String toString() {
        return String.format(
            "Fuel Economy (City): %.1f mpg, Fuel Economy (Highway): %.1f mpg, " +
            "Seating Capacity: %d, Cargo Volume: %.1f cubic feet",
            fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
    }
}
