package masteryprojects;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class LocalBank {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalBank() {
		initialize();
		Bank easySave = new Bank();
		 Scanner input = new Scanner(System.in);
		 String action, acctID;
		 Double amt;

		 /* display menu of choices */
		 do {
		 System.out.println("\nDeposit\\Withdrawal\\Check balance");
		 System.out.println("Add an account\\Remove an account");
		 System.out.println("Quit\n");
		 System.out.print("Enter choice: ");
		 action = input.next();

		 if (action.equalsIgnoreCase("A")) {
		 easySave.addAccount();
		 } else if (!action.equalsIgnoreCase("Q")) {
		 System.out.print("Enter account ID: ");
		 acctID = input.next();
		 if (action.equalsIgnoreCase("D")) {
		 System.out.print("Enter deposit amount: ");
		 amt = input.nextDouble();
		 easySave.transaction(1, acctID, amt);
		 } else if (action.equalsIgnoreCase("W")) {
		 System.out.print("Enter withdrawal amount: ");
		 amt = input.nextDouble();
		 easySave.transaction(2, acctID, amt);
		 } else if (action.equalsIgnoreCase("C")) {
		 easySave.checkBalance(acctID);
		 } else if (action.equalsIgnoreCase("R")) {
		 easySave.deleteAccount(acctID);
		 }
		 }
		 } while (!action.equalsIgnoreCase("Q"));
		 }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
