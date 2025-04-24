package Mastery3;

/**
 * Represents a Car vehicle that extends the base Vehicle class.
 * Adds car-specific properties and behaviors.
 */
public class Car extends Vehicle {
    // Additional property specific to Car
    private final String bodyStyle;

    /**
     * Constructs a new Car instance with specified properties.
     *
     * @param fuelEconomyCity   Fuel economy in city conditions (miles per gallon)
     * @param fuelEconomyHwy    Fuel economy in highway conditions (miles per gallon)
     * @param seatingCapacity   Maximum number of passengers the car can accommodate
     * @param cargoVolume       Available cargo space in cubic feet
     * @param bodyStyle         Style/type of the car body (e.g., Sedan, SUV, Coupe)
     */
    public Car(double fuelEconomyCity, double fuelEconomyHwy, 
               int seatingCapacity, double cargoVolume, String bodyStyle) {
        super(fuelEconomyCity, fuelEconomyHwy, seatingCapacity, cargoVolume);
        this.bodyStyle = bodyStyle;
    }

    /**
     * Displays the type of vehicle (implementation of abstract method from Vehicle).
     * Prints "This is a Car." to standard output.
     */
    @Override
    public void displayVehicleType() {
        System.out.println("This is a Car.");
    }

    /**
     * Returns a string representation of the Car including all properties.
     *
     * @return String containing all vehicle properties plus car-specific body style
     */
    @Override
    public String toString() {
        return super.toString() + ", Body Style: " + bodyStyle;
    }

    /**
     * Gets the body style of the car.
     *
     * @return The body style of the car
     */
    public String getBodyStyle() {
        return bodyStyle;
    }
}