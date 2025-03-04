package masteryprojects;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBank {

	private JFrame frame; // Frame for the GUI
	private JTextField acctNum; // Field to input account number
	private JTextField amt; // Field to input amount
	private JTextField fName; // Field to input first name
	private JTextField lName; // Field to input last name
	private JTextField begBalance; // Field to input beginning balance
	
	Bank easySave = new Bank(); // Instance of Bank class to manage transactions and accounts

	// Main method to launch the GUI
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank(); // Create the window
					window.frame.setVisible(true); // Make the frame visible
				} catch (Exception e) {
					e.printStackTrace(); // Catch any exceptions and print stack trace
				}
			}
		});
	}

	// Constructor to initialize the frame and GUI components
	public LocalBank() {
		initialize(); // Call method to set up the GUI
	}

	// Method to initialize the components of the GUI
	private void initialize() {
		frame = new JFrame(); // Create a new frame
		frame.setBounds(100, 100, 521, 459); // Set the size and position of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close operation
		frame.getContentPane().setLayout(null); // Set the layout of the content pane

		// Create and configure the account number text field
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				acctNum.setText(null); // Clear the default text when clicked
			}
		});
		acctNum.setForeground(Color.GRAY); // Set text color to gray
		acctNum.setFont(new Font("Tahoma", Font.PLAIN, 13)); // Set font style
		acctNum.setText("Enter account Number:"); // Set default text
		acctNum.setBounds(34, 106, 436, 19); // Set position and size
		frame.getContentPane().add(acctNum); // Add text field to the frame
		acctNum.setColumns(10); // Set column count for the text field

		// Create and configure the amount text field
		amt = new JTextField(); 
		amt.setText("Enter amount:"); // Set default text
		amt.setForeground(Color.GRAY); // Set text color to gray
		amt.setFont(new Font("Tahoma", Font.PLAIN, 13)); // Set font style
		amt.setColumns(10); // Set column count
		amt.setBounds(34, 140, 436, 19); // Set position and size
		frame.getContentPane().add(amt); // Add text field to the frame

		// Create and configure the first name text field
		fName = new JTextField();
		fName.setText("Enter first name:"); // Set default text
		fName.setForeground(Color.GRAY); // Set text color to gray
		fName.setFont(new Font("Tahoma", Font.PLAIN, 13)); // Set font style
		fName.setColumns(10); // Set column count
		fName.setBounds(34, 179, 436, 19); // Set position and size
		frame.getContentPane().add(fName); // Add text field to the frame

		// Create and configure the last name text field
		lName = new JTextField();
		lName.setText("Enter last name:"); // Set default text
		lName.setForeground(Color.GRAY); // Set text color to gray
		lName.setFont(new Font("Tahoma", Font.PLAIN, 13)); // Set font style
		lName.setColumns(10); // Set column count
		lName.setBounds(34, 214, 436, 19); // Set position and size
		frame.getContentPane().add(lName); // Add text field to the frame

		// Create and configure the beginning balance text field
		begBalance = new JTextField();
		begBalance.setText("Enter beginning balance:"); // Set default text
		begBalance.setForeground(Color.GRAY); // Set text color to gray
		begBalance.setFont(new Font("Tahoma", Font.PLAIN, 13)); // Set font style
		begBalance.setColumns(10); // Set column count
		begBalance.setBounds(34, 253, 436, 19); // Set position and size
		frame.getContentPane().add(begBalance); // Add text field to the frame

		// Label to display account information
		JLabel acctinfo = new JLabel("Account info displayed here");
		acctinfo.setFont(new Font("Tahoma", Font.PLAIN, 12)); // Set font style
		acctinfo.setBounds(34, 296, 436, 52); // Set position and size
		frame.getContentPane().add(acctinfo); // Add label to the frame

		// Create a JComboBox for selecting bank activities
		JComboBox bankActivities = new JComboBox();

		// Button to process the selected transaction
		JButton btnNewButton = new JButton("Process Transaction");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String amount, message;
				
				// Perform the selected transaction
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					amount = amt.getText(); // Get the amount from the text field
					message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount)); // Process deposit
				}
				else if(bankActivities.getSelectedItem().equals("Widhdrawal"))
				{
					amount = amt.getText(); // Get the amount from the text field
					message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount)); // Process withdrawal
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
					// Implement check balance logic here
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					amount = begBalance.getText(); // Get the beginning balance
					message = easySave.addAccount(fName.getText(),lName.getText(), Double.parseDouble(amount)); // Add new account
					acctinfo.setText("New Account ID: " + message); // Display new account ID
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
					// Implement remove account logic here
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16)); // Set button font
		btnNewButton.setBounds(34, 358, 210, 54); // Set position and size
		frame.getContentPane().add(btnNewButton); // Add button to the frame

		// Action listener for changes in the selected bank activity
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				// Highlight relevant fields based on selected activity
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					acctNum.setForeground(Color.red); // Highlight account number field in red
					amt.setForeground(Color.red); // Highlight amount field in red
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					// Implement behavior for withdrawal activity here
				}
			}
		});
		bankActivities.setFont(new Font("Tahoma", Font.PLAIN, 14)); // Set font style for combo box
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an action:", "Deposit", "Widhdrawal", "Check Balance", "Add Account", "Remove Account"})); // Set options for activities
		bankActivities.setBounds(34, 24, 436, 46); // Set position and size
		frame.getContentPane().add(bankActivities); // Add combo box to the frame
	}
}
