package masteryprojects;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Breakeplate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakeplate window = new Breakeplate();
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
	public Breakeplate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		// Initialize the ImageIcons to hold the images used in the game
		ImageIcon okplate = new ImageIcon("../Chapter10/src/Mastery/masteryimages/fixedplate.jpg");  // Image for a good plate
		ImageIcon brokeplate = new ImageIcon("../Chapter10/src/Mastery/masteryimages/brokenplate.jpg"); // Image for a broken plate
		ImageIcon tig = new ImageIcon("../Chapter10/src/Mastery/masteryimages/tiger_plush.gif");  // Image for winning (tiger plush)
		ImageIcon splat = new ImageIcon("../Chapter10/src/Mastery/masteryimages/sticker.gif"); // Image for losing (splat sticker)

		// Create the main frame for the game
		frame = new JFrame();  // Instantiate a new JFrame
		frame.setBounds(100, 100, 577, 482);  // Set the size and position of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit the program when the window is closed

		// Create a JPanel to contain the game components
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);  // Add the panel to the center of the frame
		panel.setLayout(null);  // Set the layout of the panel to null for absolute positioning

		// Create labels for the three plates, these will display images
		JLabel Plate1 = new JLabel("");  // Label for the first plate
		Plate1.setBounds(10, 26, 180, 147);  // Set the position and size of Plate1
		panel.add(Plate1);  // Add Plate1 label to the panel

		JLabel Plate2 = new JLabel("");  // Label for the second plate
		Plate2.setBounds(191, 26, 180, 147);  // Set the position and size of Plate2
		panel.add(Plate2);  // Add Plate2 label to the panel

		JLabel Plate3 = new JLabel("");  // Label for the third plate
		Plate3.setBounds(381, 26, 180, 147);  // Set the position and size of Plate3
		panel.add(Plate3);  // Add Plate3 label to the panel

		// Create a label to show the result (win or lose)
		JLabel winlose = new JLabel("");  // Label to show win or lose image
		winlose.setBounds(224, 300, 199, 117);  // Set the position and size of the result label
		panel.add(winlose);  // Add winlose label to the panel

		// Create a button to start the game
		JButton play = new JButton("Play");  // Create a button labeled "Play"
		play.addActionListener(new ActionListener() {  // Add an ActionListener to the play button
		    public void actionPerformed(ActionEvent e) {
		        // Generate random numbers to decide the state of each plate (1 for good plate, 2 for broken plate)
		        int rannum, rannum2, rannum3;

		        rannum = (int)(2 * Math.random() + 1);  // Random number for Plate1 (1 or 2)
		        if (rannum == 1) {
		            Plate1.setIcon(okplate);  // Set the plate image to a good plate if rannum is 1
		        } else {
		            Plate1.setIcon(brokeplate);  // Set the plate image to a broken plate if rannum is 2
		        }

		        rannum2 = (int)(2 * Math.random() + 1);  // Random number for Plate2 (1 or 2)
		        if (rannum2 == 1) {
		            Plate2.setIcon(okplate);  // Set the plate image to a good plate if rannum2 is 1
		        } else {
		            Plate2.setIcon(brokeplate);  // Set the plate image to a broken plate if rannum2 is 2
		        }

		        rannum3 = (int)(2 * Math.random() + 1);  // Random number for Plate3 (1 or 2)
		        if (rannum3 == 1) {
		            Plate3.setIcon(okplate);  // Set the plate image to a good plate if rannum3 is 1
		        } else {
		            Plate3.setIcon(brokeplate);  // Set the plate image to a broken plate if rannum3 is 2
		        }

		        // Check if all plates are broken (rannum == 2) to determine win or lose
		        if (rannum == 2 && rannum2 == 2 && rannum3 == 2) {
		            winlose.setIcon(tig);  // Set the win image (tiger plush) if all plates are broken
		            play.setText("Play Again");  // Change the button text to "Play Again" after game ends
		        } else {
		            winlose.setIcon(splat);  // Set the lose image (splat sticker) if not all plates are broken
		            play.setText("Play Again");  // Change the button text to "Play Again" after game ends
		        }
		    }
		});

		// Customize the play button
		play.setFont(new Font("Tahoma", Font.PLAIN, 40));  // Set the font style and size of the play button text
		play.setBounds(142, 206, 268, 83);  // Set the position and size of the play button
		panel.add(play);  // Add the play button to the panel
		}
	}