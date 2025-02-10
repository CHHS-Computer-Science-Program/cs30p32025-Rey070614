package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class demo {

	private JFrame frame;
	private JTextField FN;
	private JTextField LN;
	private JComboBox gradel;
	private JTextField disp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
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
	public demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon cr = new ImageIcon("../Chapter10/src/SkillBuilders/download.jpg");
		ImageIcon ND = new ImageIcon("../Chapter10/src/SkillBuilders/download (1).png");
		ImageIcon NT = new ImageIcon("../Chapter10/src/SkillBuilders/download.png");
		ImageIcon FL = new ImageIcon("../Chapter10/src/SkillBuilders/download (2).png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 578, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel schl = new JPanel();
		schl.setBounds(10, 11, 552, 501);
		frame.getContentPane().add(schl);
		schl.setLayout(null);
		
		FN = new JTextField();
		FN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				FN.setText("");
			}
			
			
			
		});
		FN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		FN.setText("First Name:");
		FN.setColumns(10);
		FN.setBounds(10, 37, 181, 59);
		schl.add(FN);
		
		
		
		LN = new JTextField();
		LN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LN.setText("");
			}
		});
		LN.setText("Last Name:");
		LN.setFont(new Font("Times New Roman", Font.BOLD, 16));
		LN.setColumns(10);
		LN.setBounds(226, 37, 174, 59);
		schl.add(LN);
		
		JComboBox sch = new JComboBox();
		sch.setModel(new DefaultComboBoxModel(new String[] {"school:", "CHHS", "NT", "ND", "FLHS"}));
		sch.setBounds(226, 131, 118, 39);
		schl.add(sch);
		
		gradel = new JComboBox();
		gradel.setModel(new DefaultComboBoxModel(new String[] {"Grade:", "10", "11", "12"}));
		gradel.setBounds(10, 128, 132, 44);
		schl.add(gradel);
		
		disp = new JTextField();
		disp.setBounds(10, 181, 364, 136);
		schl.add(disp);
		disp.setColumns(10);
		
		JLabel imgA = new JLabel("");
		imgA.setBounds(20, 328, 354, 142);
		schl.add(imgA);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Grade = "  ";
				String school = " ";
				String firstname = FN.getText();
				String lastname = LN.getText();
				if(gradel.getSelectedItem().equals("10"))
				{
					Grade = "Grade: 10";
				}
				
				if(gradel.getSelectedItem().equals("11"))
				{
					Grade = "Grade: 11";
				}
				if(gradel.getSelectedItem().equals("12"))
				{
					Grade= "Grade: 12";
					
				}
				
				
				if(sch.getSelectedItem().equals("CHHS"))
				{
					school = "school: CHHS";
					imgA.setIcon(cr);
				}
				
				else if(sch.getSelectedItem().equals("NT"))
				{
					school = "school: NT";
					imgA.setIcon(NT);
				}
				else if(sch.getSelectedItem().equals("ND"))
				{
					school = "school: ND";
					imgA.setIcon(ND);
				}
				else 
				{
					school = "school: FLHS";
					imgA.setIcon(FL);
					
				}
				disp.setText(firstname + " " 
						 + lastname + " " + Grade +" "+ school + ""); 
			}
		});
		btnNewButton.setBounds(410, 21, 132, 449);
		schl.add(btnNewButton);
		
		
	}
}
