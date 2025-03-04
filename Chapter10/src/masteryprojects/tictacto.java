package masteryprojects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class tictacto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictacto window = new tictacto();
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
	public tictacto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	boolean playerTurn = false;

	private void initialize() {
		
		// Create a 3x3 grid of JButtons for the Tic-Tac-Toe board
		JButton board[][] = new JButton[3][3];

		// Create the main JFrame to hold the game components
		frame = new JFrame();
		frame.setBounds(100, 100, 894, 563);  // Set the position and size of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit the program when the window is closed
		frame.getContentPane().setLayout(null);  // Set the layout of the frame to null for absolute positioning

		// Create a JPanel to hold the game components (like buttons, labels)
		JPanel panel = new JPanel();
		panel.setBounds(53, 0, 764, 524);  // Set the position and size of the panel
		frame.getContentPane().add(panel);  // Add the panel to the frame
		panel.setLayout(null);  // Set the panel layout to null for absolute positioning

		// Create a label to display the winner (initially empty)
		JLabel WINNER = new JLabel("");  
		WINNER.setBounds(411, 437, 160, 45);  // Set the position and size of the winner label
		panel.add(WINNER);  // Add the winner label to the panel

		// Create a label to show whose turn it is (X or O)
		JLabel TURN = new JLabel("TURN: X");
		TURN.setBounds(129, 422, 198, 76);  // Set the position and size of the turn label
		panel.add(TURN);  // Add the turn label to the panel

		// Create an ActionListener for the buttons to handle player moves
		ActionListener but = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JButton btn = (JButton)(e.getSource());  // Get the button that was clicked

		        // If the button already has text, it means it's already been clicked, so return
		        if (btn.getText() != "") {
		            return;
		        }

		        // Set the text of the button to "X" or "O" based on whose turn it is
		        btn.setText(playerTurn ? "O" : "X");
		        playerTurn = !playerTurn;  // Toggle the turn for the next player

		        boolean win;  // Variable to check if there's a winner
		        String winner = "";  // Variable to store the winner

		        // Check for a winner by checking all rows and columns
		        for (int i = 0; i < 3; i++) {
		            // Check if the current row has all matching text
		            win = (board[0][i].getText().equals(board[1][i].getText()) && (board[0][i].getText().equals(board[2][i].getText())));
		            win = win && !board[0][i].getText().equals("");  // Ensure the text isn't empty
		            if (win) {
		                winner = board[0][i].getText();  // If there's a winner, store the winning player's symbol
		            }

		            // Check if the current column has all matching text
		            win = (board[i][0].getText().equals(board[i][1].getText()) && (board[i][0].getText().equals(board[i][2].getText())));
		            win = win && !board[0][i].getText().equals("");  // Ensure the text isn't empty
		            if (win) {
		                winner = board[i][0].getText();  // If there's a winner, store the winning player's symbol
		            }
		        }

		        // Check the two diagonals for a winner
		        win = (board[0][0].getText().equals(board[1][1].getText()) && (board[0][0].getText().equals(board[2][2].getText())));
		        win = win && !board[0][0].getText().equals("");  // Ensure the text isn't empty
		        if (win) {
		            winner = board[0][0].getText();  // If there's a winner, store the winning player's symbol
		        }

		        win = (board[0][2].getText().equals(board[1][1].getText()) && (board[0][2].getText().equals(board[2][0].getText())));
		        win = win && !board[0][2].getText().equals("");  // Ensure the text isn't empty
		        if (win) {
		            winner = board[2][2].getText();  // If there's a winner, store the winning player's symbol
		        }

		        // If there is a winner, display the winner and disable all buttons
		        if (winner != "") {
		            WINNER.setText("The winner is: " + winner);  // Display the winner's name
		            // Disable all the buttons so no further moves can be made
		            for (int i = 0; i < 3; i++) {
		                for (int j = 0; j < 3; j++) {
		                    board[i][j].setEnabled(false);
		                }
		            }
		        } else {
		            // If there is no winner yet, update the turn label to show the next player's turn
		            TURN.setText("Turn: " + (playerTurn ? "O" : "X"));
		        }
		    }
		};

		// Create the buttons for the Tic-Tac-Toe grid and add them to the panel
		JButton Tl = new JButton("");  // Top-left button
		Tl.addActionListener(but);  // Attach the action listener
		Tl.setBounds(10, 22, 209, 109);  // Set the position and size of the button
		panel.add(Tl);  // Add the button to the panel
		board[0][0] = Tl;  // Store the button in the board array

		JButton Tm = new JButton("");  // Top-middle button
		Tm.setBounds(260, 22, 209, 109);  // Set the position and size of the button
		Tm.addActionListener(but);  // Attach the action listener
		panel.add(Tm);  // Add the button to the panel
		board[1][0] = Tm;  // Store the button in the board array

		JButton Tr = new JButton("");  // Top-right button
		Tr.setBounds(511, 22, 209, 109);  // Set the position and size of the button
		Tr.addActionListener(but);  // Attach the action listener
		panel.add(Tr);  // Add the button to the panel
		board[2][0] = Tr;  // Store the button in the board array

		JButton Ml = new JButton("");  // Middle-left button
		Ml.setBounds(10, 162, 209, 109);  // Set the position and size of the button
		Ml.addActionListener(but);  // Attach the action listener
		panel.add(Ml);  // Add the button to the panel
		board[0][1] = Ml;  // Store the button in the board array

		JButton Mm = new JButton("");  // Middle-middle button
		Mm.setBounds(260, 162, 209, 109);  // Set the position and size of the button
		Mm.addActionListener(but);  // Attach the action listener
		panel.add(Mm);  // Add the button to the panel
		board[1][1] = Mm;  // Store the button in the board array

		JButton Mr = new JButton("");  // Middle-right button
		Mr.setBounds(511, 162, 209, 109);  // Set the position and size of the button
		Mr.addActionListener(but);  // Attach the action listener
		panel.add(Mr);  // Add the button to the panel
		board[2][1] = Mr;  // Store the button in the board array

		JButton Bl = new JButton("");  // Bottom-left button
		Bl.setBounds(10, 293, 209, 109);  // Set the position and size of the button
		Bl.addActionListener(but);  // Attach the action listener
		panel.add(Bl);  // Add the button to the panel
		board[0][2] = Bl;  // Store the button in the board array

		JButton Bm = new JButton("");  // Bottom-middle button
		Bm.setBounds(260, 293, 209, 109);  // Set the position and size of the button
		Bm.addActionListener(but);  // Attach the action listener
		panel.add(Bm);  // Add the button to the panel
		board[1][2] = Bm;  // Store the button in the board array

		JButton Br = new JButton("");  // Bottom-right button
		Br.setBounds(511, 293, 209, 109);  // Set the position and size of the button
		Br.addActionListener(but);  // Attach the action listener
		panel.add(Br);  // Add the button to the panel
		board[2][2] = Br;  // Store the button in the board array

		}	
	}