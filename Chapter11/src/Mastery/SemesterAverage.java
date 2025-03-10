      package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.lang.ProcessHandle.Info;
import javax.swing.JTextField;

public class SemesterAverage {

	private JFrame frame;
	private JTextField textField;

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
		double ave = Double.NaN;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 634);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel studentName = new JLabel("Student Name:");
		studentName.setFont(new Font("Tahoma", Font.PLAIN, 22));
		studentName.setBounds(10, 32, 270, 39);
		frame.getContentPane().add(studentName);
		
		JLabel Grade = new JLabel("Grade Level:");
		Grade.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Grade.setBounds(10, 80, 270, 39);
		frame.getContentPane().add(Grade);
		
		JLabel Semester = new JLabel("Semester:");
		Semester.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Semester.setBounds(10, 135, 270, 39);
		frame.getContentPane().add(Semester);
		
		JLabel GR1 = new JLabel("Grade 1: ");
		GR1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GR1.setBounds(10, 180, 270, 39);
		frame.getContentPane().add(GR1);
		
		JLabel GR2 = new JLabel("Grade 2: ");
		GR2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GR2.setBounds(10, 230, 270, 39);
		frame.getContentPane().add(GR2);
		
		JLabel GR3 = new JLabel("Grade 3: ");
		GR3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GR3.setBounds(10, 280, 270, 39);
		frame.getContentPane().add(GR3);
		
		JLabel GR4 = new JLabel("Grade 4: ");
		GR4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GR4.setBounds(10, 330, 136, 39);
		frame.getContentPane().add(GR4);
		
		JLabel avg = new JLabel("Average:" + ave);
		avg.setFont(new Font("Tahoma", Font.PLAIN, 22));
		avg.setBounds(10, 417, 270, 39);
		frame.getContentPane().add(avg);
		
		textField = new JTextField();
		textField.setBounds(237, 37, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 85, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 135, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 180, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 230, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 280, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(237, 335, 270, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
	}
}
