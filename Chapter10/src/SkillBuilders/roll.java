package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roll window = new roll();
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
	public roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (3).png");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (4).png");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (5).png");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (6).png");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (7).png");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/SkillBuilders/images/download (8).png");
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 539, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 1);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Facedie2 = new JLabel("");
		Facedie2.setBounds(290, 182, 203, 165);
		frame.getContentPane().add(Facedie2);
		
		JLabel Facedie = new JLabel("");
		Facedie.setBounds(53, 182, 203, 165);
		frame.getContentPane().add(Facedie);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(104, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Rbut = new JButton("Roll Dice");
		Rbut.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Rbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int roll, roll2;
				
				roll = (int)(6*Math.random()+1);
				if(roll == 1)
				
				{
					Facedie.setIcon(d1);
				}
				else if(roll == 2) 
				{
					Facedie.setIcon(d2);
				}
				else if(roll == 3) 
				{
					Facedie.setIcon(d3);
				}
				else if(roll == 4) 
				{
					Facedie.setIcon(d4);
				}
				else if(roll == 5) 
				{
					Facedie.setIcon(d5);
				}
				else 
				{
					Facedie.setIcon(d6);
				}
				
				roll2 = (int)(6*Math.random()+1);
				if(roll2 == 1)
				
				{
					Facedie2.setIcon(d1);
				}
				else if(roll2 == 2) 
				{
					Facedie2.setIcon(d2);
				}
				else if(roll2 == 3) 
				{
					Facedie2.setIcon(d3);
				}
				else if(roll2 == 4) 
				{
					Facedie2.setIcon(d4);
				}
				else if(roll2 == 5) 
				{
					Facedie2.setIcon(d5);
				}
				else 
				{
					Facedie2.setIcon(d6);
				}
			}
		});
		Rbut.setBounds(114, 11, 321, 108);
		frame.getContentPane().add(Rbut);
		
		
	}
}
