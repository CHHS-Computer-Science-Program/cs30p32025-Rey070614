package Mastery2;
/**
 * Represents a personal bank account that extends the basic Account functionality.
 * Includes minimum balance requirements and penalty fees for falling below the minimum.
 */
public class Personal extends Account {
    // Constants for minimum balance threshold and penalty fee
    private static final double MIN_BALANCE = 100.0;
    private static final double PENALTY = 2.0;

    /**
     * Constructs a Personal account with only an ID (used for account lookup).
     * 
     * @param ID the account identifier
     */
    public Personal(String ID) {
        super(ID);
    }

    /**
     * Constructs a fully initialized Personal account.
     * 
     * @param bal the initial account balance
     * @param fName the customer's first name
     * @param lName the customer's last name
     * @param street the street address
     * @param city the city
     * @param province the province/state
     * @param postalCode the postal/zip code
     */
    public Personal(double bal, String fName, String lName, String street, 
                   String city, String province, String postalCode) {
        super(bal, fName, lName, street, city, province, postalCode);
    }

    /**
     * Processes a withdrawal from the account.
     * Applies a penalty if the balance falls below the minimum required balance after withdrawal.
     * 
     * @param amt the amount to withdraw (must be positive)
     * @throws IllegalArgumentException if the amount is negative
     */
    @Override
    public void withdrawal(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        
        super.withdrawal(amt);  // Perform the withdrawal
        
        // Check if balance fell below minimum after withdrawal
        if (getBalance() < MIN_BALANCE) {
            super.withdrawal(PENALTY);  // Apply penalty
            System.out.println("Balance below minimum. Penalty of $" + 
                             PENALTY + " applied. New balance: $" + getBalance());
        }
    }
}
