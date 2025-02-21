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
		
		
		
		ImageIcon okplate = new ImageIcon("../Chapter10/src/Mastery/masteryimages/fixedplate.jpg");
		ImageIcon brokeplate = new ImageIcon("../Chapter10/src/Mastery/masteryimages/brokenplate.jpg");
		ImageIcon tig = new ImageIcon("../Chapter10/src/Mastery/masteryimages/tiger_plush.gif");
		ImageIcon splat = new ImageIcon("../Chapter10/src/Mastery/masteryimages/sticker.gif");
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Plate1 = new JLabel("");
		Plate1.setBounds(10, 26, 180, 147);
		panel.add(Plate1);
		
		JLabel Plate2 = new JLabel("");
		Plate2.setBounds(191, 26, 180, 147);
		panel.add(Plate2);
		
		JLabel Plate3 = new JLabel("");
		Plate3.setBounds(381, 26, 180, 147);
		panel.add(Plate3);
		
		JLabel winlose = new JLabel("");
		winlose.setBounds(224, 300, 199, 117);
		panel.add(winlose);
		
		JButton play = new JButton("Play");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rannum,rannum2,rannum3;
				
				rannum = (int)(2*Math.random()+1);
				if(rannum == 1)
				{
					Plate1.setIcon(okplate);
				}
				else
				{
					Plate1.setIcon(brokeplate);
				}
				
				rannum2 = (int)(2*Math.random()+1);
				if(rannum2 == 1)
				{
					Plate2.setIcon(okplate);
				}
				else 
				{
					Plate2.setIcon(brokeplate);
				}
				rannum3 = (int)(2*Math.random()+1);
				if(rannum3 == 1)
				{
					Plate3.setIcon(okplate);
				}
				else 
				{
					Plate3.setIcon(brokeplate);
				}
				
				if (rannum == 2 && rannum2 == 2 && rannum3 == 2)
				{
					winlose.setIcon(tig);
					play.setText("Play Agian");
				}
				else 
				{
					winlose.setIcon(splat);
					play.setText("Play Agian");
				}
				
			}
		});
		play.setFont(new Font("Tahoma", Font.PLAIN, 40));
		play.setBounds(142, 206, 268, 83);
		panel.add(play);
		
		
		
		
	}
}
