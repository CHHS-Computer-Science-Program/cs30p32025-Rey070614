package Mastery;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
public class SemesterAverage {
	Students stu = new Students();
	
	private JFrame frame;
	private JTextField stuName;
	private JTextField stuGrade;
	private JTextField semester;
	private JTextField grd3;
	private JTextField grd2;
	private JTextField grd1;
	private JTextField grd4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAverage window = new SemesterAverage();
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
	public SemesterAverage() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// Create a new JFrame instance to hold the GUI components
		frame = new JFrame();
		// Set the position and size of the frame (x, y, width, height)
		frame.setBounds(100, 100, 780, 544);
		// Set the default close operation to exit the application when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the layout of the content pane to null (absolute positioning)
		frame.getContentPane().setLayout(null);

		// Create a new JPanel to hold the main components of the GUI
		JPanel panel = new JPanel();
		// Set the position and size of the panel within the frame
		panel.setBounds(0, 0, 754, 494);
		// Add the panel to the frame's content pane
		frame.getContentPane().add(panel);
		// Set the layout of the panel to null (absolute positioning)
		panel.setLayout(null);

		// Create a label for the student name field
		JLabel lblNewLabel = new JLabel("Student Name: ");
		// Set the font of the label
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel.setBounds(10, 9, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel);

		// Create a label for the grade level field
		JLabel lblNewLabel_1 = new JLabel("Grade Level: ");
		// Set the font of the label
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1.setBounds(10, 30, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1);

		// Create a text field for entering the student's name
		stuName = new JTextField();
		// Set the position and size of the text field within the panel
		stuName.setBounds(501, 5, 233, 20);
		// Add the text field to the panel
		panel.add(stuName);
		// Set the number of columns for the text field
		stuName.setColumns(10);

		// Create a text field for entering the student's grade level
		stuGrade = new JTextField();
		// Set the number of columns for the text field
		stuGrade.setColumns(10);
		// Set the position and size of the text field within the panel
		stuGrade.setBounds(501, 26, 233, 20);
		// Add the text field to the panel
		panel.add(stuGrade);

		// Create a text field for entering the semester number
		semester = new JTextField();
		// Set the number of columns for the text field
		semester.setColumns(10);
		// Set the position and size of the text field within the panel
		semester.setBounds(501, 47, 233, 20);
		// Add the text field to the panel
		panel.add(semester);

		// Create a text field for entering the third grade
		grd3 = new JTextField();
		// Set the number of columns for the text field
		grd3.setColumns(10);
		// Set the position and size of the text field within the panel
		grd3.setBounds(501, 110, 233, 20);
		// Add the text field to the panel
		panel.add(grd3);

		// Create a text field for entering the second grade
		grd2 = new JTextField();
		// Set the number of columns for the text field
		grd2.setColumns(10);
		// Set the position and size of the text field within the panel
		grd2.setBounds(501, 89, 233, 20);
		// Add the text field to the panel
		panel.add(grd2);

		// Create a text field for entering the first grade
		grd1 = new JTextField();
		// Set the number of columns for the text field
		grd1.setColumns(10);
		// Set the position and size of the text field within the panel
		grd1.setBounds(501, 68, 233, 20);
		// Add the text field to the panel
		panel.add(grd1);

		// Create a text field for entering the fourth grade
		grd4 = new JTextField();
		// Set the number of columns for the text field
		grd4.setColumns(10);
		// Set the position and size of the text field within the panel
		grd4.setBounds(501, 131, 233, 20);
		// Add the text field to the panel
		panel.add(grd4);

		// Create a label for the semester number field
		JLabel lblNewLabel_1_1 = new JLabel("Semester Number: ");
		// Set the font of the label
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_1.setBounds(10, 51, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1_1);

		// Create a label for the first grade field
		JLabel lblNewLabel_1_2 = new JLabel("Grade 1: ");
		// Set the font of the label
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_2.setBounds(10, 74, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1_2);

		// Create a label for the second grade field
		JLabel lblNewLabel_1_2_1 = new JLabel("Grade 2: ");
		// Set the font of the label
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_2_1.setBounds(10, 95, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1_2_1);

		// Create a label for the third grade field
		JLabel lblNewLabel_1_2_2 = new JLabel("Grade 3: ");
		// Set the font of the label
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_2_2.setBounds(10, 116, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1_2_2);

		// Create a label for the fourth grade field
		JLabel lblNewLabel_1_2_3 = new JLabel("Grade 4: ");
		// Set the font of the label
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_2_3.setBounds(10, 137, 136, 14);
		// Add the label to the panel
		panel.add(lblNewLabel_1_2_3);

		// Create a label for the average field
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Average: ");
		// Set the font of the label
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Set the position and size of the label within the panel
		lblNewLabel_1_2_3_1.setBounds(10, 153, 64, 20);
		// Add the label to the panel
		panel.add(lblNewLabel_1_2_3_1);

		// Create a label to display the calculated student average
		JLabel studentAvg = new JLabel("");
		// Set the position and size of the label within the panel
		studentAvg.setBounds(75, 158, 46, 14);
		// Add the label to the panel
		panel.add(studentAvg);

		// Create a text area to display the list of students
		JTextArea stuList = new JTextArea();
		// Set the position and size of the text area within the panel
		stuList.setBounds(10, 184, 724, 235);
		// Add the text area to the panel
		panel.add(stuList);

		// Create a new panel to hold the buttons at the bottom of the GUI
		JPanel panel_1 = new JPanel();
		// Set the position and size of the panel within the main panel
		panel_1.setBounds(10, 430, 724, 42);
		// Add the panel to the main panel
		panel.add(panel_1);
		// Set the layout of the panel to a grid layout with one row and flexible columns
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		// Create a button to save the student data to a file
		JButton saveFile = new JButton("Save to File");
		// Set the background color of the button
		saveFile.setBackground(UIManager.getColor("Button.background"));
		// Set the font of the button
		saveFile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Add an action listener to the button to handle click events
		saveFile.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Print a message to the console when the button is clicked
		        System.out.println("Save File!");

		        // Parse the grades from the text fields and convert them to doubles
		        double g1 = Double.parseDouble(grd1.getText());
		        double g2 = Double.parseDouble(grd2.getText());
		        double g3 = Double.parseDouble(grd3.getText());
		        double g4 = Double.parseDouble(grd4.getText());

		        // Calculate the student's average using the provided method and display it
		        String stuAvg = stu.average((stuName.getText()).toString(), (stuGrade.getText()).toString(), (semester.getText()).toString(), g1, g2, g3, g4);
		        System.out.println(stuAvg);
		        studentAvg.setText(stuAvg);
		    }
		});
		// Add the save button to the button panel
		panel_1.add(saveFile);

		// Create a button to view the contents of the saved file
		JButton viewFile = new JButton("View File Contents");
		// Add the button to the button panel
		panel_1.add(viewFile);
		// Set the font of the button
		viewFile.setFont(new Font("Tahoma", Font.PLAIN, 15));
		// Add an action listener to the button to handle click events
		viewFile.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Print a message to the console when the button is clicked
		        System.out.println("View File!");
		        // Display the contents of the file in the text area
		        stuList.setText(stu.viewFile());
		    }
		});		
	}
}








