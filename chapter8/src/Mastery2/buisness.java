package Mastery2;


/**
 * Represents a business bank account that extends the basic Account functionality.
 * Implements higher minimum balance requirements and penalty fees than personal accounts.
 */
public class buisness extends Account {
    // Constants for business account requirements
    private static final double MIN_BALANCE = 500.0;  // Minimum balance for business accounts
    private static final double PENALTY = 10.0;       // Penalty for falling below minimum balance

    /**
     * Constructs a Business account with initial balance and customer information.
     * 
     * @param bal the initial account balance
     * @param fName the customer's first name
     * @param lName the customer's last name
     * @param street the street address
     * @param city the city
     * @param province the province/state
     * @param postalCode the postal/zip code
     */
    public buisness(double bal, String fName, String lName, String street,
                   String city, String province, String postalCode) {
        super(bal, fName, lName, street, city, province, postalCode);
    }

    /**
     * Processes a withdrawal from the business account.
     * Applies a penalty if the balance falls below the business minimum requirement.
     * 
     * @param amt the amount to withdraw (must be positive)
     * @throws IllegalArgumentException if the amount is negative or exceeds balance
     */
    @Override
    public void withdrawal(double amt) {
        if (amt <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        
        if (amt > getBalance()) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }

        super.withdrawal(amt);  // Perform the withdrawal
        
        // Apply penalty if balance fell below minimum
        if (getBalance() < MIN_BALANCE) {
            super.withdrawal(PENALTY);
            System.out.printf("Business account penalty applied: $%.2f. New balance: $%.2f%n",
                            PENALTY, getBalance());
        }
    }

    /**
     * Gets the minimum balance requirement for business accounts.
     * 
     * @return the minimum balance required
     */
    public static double getMinBalance() {
        return MIN_BALANCE;
    }

    /**
     * Gets the penalty amount for falling below minimum balance.
     * 
     * @return the penalty amount
     */
    public static double getPenalty() {
        return PENALTY;
    }
}
