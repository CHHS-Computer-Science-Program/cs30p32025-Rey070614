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
		
		JButton board [][] = new JButton [3][3];
		frame = new JFrame();
		frame.setBounds(100, 100, 894, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(53, 0, 764, 524);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel WINNER = new JLabel("");
		WINNER.setBounds(411, 437, 160, 45);
		panel.add(WINNER);
		
		JLabel TURN = new JLabel("TURN: X");
		TURN.setBounds(129, 422, 198, 76);
		panel.add(TURN);
		
		
		ActionListener but = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				JButton btn = (JButton)(e.getSource());
				
				if (btn.getText() !="") {
					return;
					}	
			
				
				btn.setText(playerTurn ? "O" : "X");
				playerTurn = !playerTurn; 
				
				boolean win;
				String winner = "";
				
				for ( int i = 0; i<3; i ++) {
					win = (board[0][i].getText().equals(board[1][i].getText()) && (board[0][i].getText().equals(board[2][i].getText())));
					win = win && !board[0][i].getText().equals("");		
					if (win) {
						winner = board[0][i].getText();
					}
				
				win = (board[i][0].getText().equals(board[i][1].getText()) && (board[i][0].getText().equals(board[i][2].getText())));
				win = win && !board[0][i].getText().equals("");		
				if (win) {
						winner = board[i][0].getText();
					
				}
				}
				
				win = (board[0][0].getText().equals(board[1][1].getText()) && (board[0][0].getText().equals(board[2][2].getText())));
				win = win && !board[0][0].getText().equals("");	
				if (win) {
					winner = board[0][0].getText();
				}
				
					
				win = (board[0][2].getText().equals(board[1][1].getText()) && (board[0][2].getText().equals(board[2][0].getText())));
				win = win && !board[0][2].getText().equals("");	
				if (win) {
					winner = board[2][2].getText();
					}
				
				
				if (winner!= "") {
					WINNER.setText("The winner is: " + winner);
					for(int i = 0;i<3; i++)
					
					{
						for(int j = 0;j<3; j++)
						{
							board [i][j].setEnabled(false);
							
						}
					}
						
					
					
				}
				else 
					TURN.setText("Turn: " + (playerTurn ? "O" : "X"));
		
				
				}
		};
		
		
		
		JButton Tl = new JButton("");
		Tl.addActionListener(but);
		Tl.setBounds(10, 22, 209, 109);
		panel.add(Tl);
		board[0][0] = Tl;
		
		JButton Tm = new JButton("");
		Tm.setBounds(260, 22, 209, 109);
		panel.add(Tm);
		Tm.addActionListener(but);
		board[1][0] = Tm;
		
		JButton Tr = new JButton("");
		Tr.setBounds(511, 22, 209, 109);
		Tr.addActionListener(but);
		panel.add(Tr);
		board[2][0] = Tr;
		
		JButton Ml = new JButton("");
		Ml.setBounds(10, 162, 209, 109);
		Ml.addActionListener(but);
		panel.add(Ml);
		board[0][1] = Ml;
		
		
		
		JButton Mm = new JButton("");
		Mm.setBounds(260, 162, 209, 109);
		Mm.addActionListener(but);
		panel.add(Mm);
		board[1][1] = Mm;
	
		JButton Mr = new JButton("");
		Mr.setBounds(511, 162, 209, 109);
		Mr.addActionListener(but);
		panel.add(Mr);
		board[2][1] = Mr;
		
		JButton Bl = new JButton("");
		Bl.setBounds(10, 293, 209, 109);
		Bl.addActionListener(but);
		panel.add(Bl);
		board[0][2] = Bl;
		
		JButton Bm = new JButton("");
		Bm.setBounds(260, 293, 209, 109);
		Bm.addActionListener(but);
		panel.add(Bm);
		board[1][2] = Bm;
		
		JButton Br = new JButton("");
		Br.setBounds(511, 293, 209, 109);
		Br.addActionListener(but);
		panel.add(Br);
		board[2][2] = Br;
		
		
		
		
			}
}
