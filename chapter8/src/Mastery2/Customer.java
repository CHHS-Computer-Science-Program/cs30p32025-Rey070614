package Mastery2;

/**
 * Represents a customer with personal and address information.
 */
public class Customer {
    // Personal information fields
    private String firstName;
    private String lastName;
    
    // Address information fields
    private String street;
    private String city;
    private String province;
    private String postalCode;

    /**
     * Constructs a new Customer with the specified information.
     * 
     * @param fName the first name of the customer
     * @param lName the last name of the customer
     * @param street the street address of the customer
     * @param city the city of the customer's address
     * @param province the province of the customer's address
     * @param postalCode the postal code of the customer's address
     */
    public Customer(String fName, String lName, String street, String city, 
                   String province, String postalCode) {
        this.firstName = fName;
        this.lastName = lName;
        this.street = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    // Address modification methods
    
    /**
     * Updates the city of the customer's address.
     * 
     * @param city the new city
     */
    public void changeCity(String city) {
        this.city = city;
    }

    /**
     * Updates the street of the customer's address.
     * 
     * @param street the new street address
     */
    public void changeStreet(String street) {
        this.street = street;
    }

    /**
     * Updates the province of the customer's address.
     * 
     * @param province the new province
     */
    public void changeProvince(String province) {
        this.province = province;
    }

    /**
     * Updates the postal code of the customer's address.
     * 
     * @param postalCode the new postal code
     */
    public void changePostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Returns a string representation of the customer's information.
     * 
     * @return a formatted string containing customer name and address
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + 
               street + ", " + city + ", " + 
               province + " " + postalCode + "\n";
    }
}