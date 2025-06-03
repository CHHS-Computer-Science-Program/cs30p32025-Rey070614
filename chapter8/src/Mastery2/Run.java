/*

Program: Run.java           Last Date of this Revision: april 23, 2025

Purpose: Main class to test account functionality for Personal and Business accounts.
The program initializes Personal and Business accounts, simulates withdrawals 
with penalties for going below minimum balances, and displays account details.

Author: Reynaldo de Guzman
School: CHHS
Course: CSE 3130 Object-Oriented Programming 2

*/

package Mastery2;

/**
 * Test class for demonstrating Personal and Business account functionality.
 * Creates sample accounts and tests withdrawal operations with penalty scenarios.
 */
public class Run { 
    public static void main(String[] args) {
        // Test Personal Account with minimum balance penalty
        System.out.println("=== Testing Personal Account ===");
        testPersonalAccount();
        
        // Test Business Account with minimum balance penalty
        System.out.println("\n=== Testing Business Account ===");
        testBusinessAccount();
    }
    
    /**
     * Demonstrates Personal account functionality including:
     * - Account creation
     * - Withdrawal that triggers penalty
     * - Balance display
     */
    private static void testPersonalAccount() {
        // Create personal account with initial balance   
        Personal personalAccount = new Personal(150.0, "Justine", "Fung", 
                "123 Center St", "Abbdayle", "CA", "07834");
        
        // Display initial account details
        System.out.println("Initial Account Details:");
        System.out.println(personalAccount);
        
        // Test withdrawal that will trigger penalty
        System.out.println("\nWithdrawing $60 from Personal Account...");
        personalAccount.withdrawal(60);  // Balance will drop below minimum ($100)
        
        // Display updated account details (should show penalty applied)
        System.out.println("\nAccount After Withdrawal:");
        System.out.println(personalAccount);
    }
    
    /**
     * Demonstrates Business account functionality including:
     * - Account creation
     * - Withdrawal that triggers penalty
     * - Balance display
     */
    private static void testBusinessAccount() {
        // Create business account with initial balance
        buisness businessAccount = new buisness(600.0, "Hari", "Shah", 
                "123 1st St", "Mayland", "CA", "34266");
        
        // Display initial account details
        System.out.println("Initial Account Details:");
        System.out.println(businessAccount);
        
        // Test withdrawal that will trigger penalty
        System.out.println("\nWithdrawing $200 from Business Account...");
        businessAccount.withdrawal(200);  // Business accounts might have different rules
        
        // Display updated account details
        System.out.println("\nAccount After Withdrawal:");
        System.out.println(businessAccount);
    }
}