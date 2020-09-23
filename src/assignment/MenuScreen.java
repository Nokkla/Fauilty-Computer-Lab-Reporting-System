package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreen {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuScreen window = new MenuScreen();
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
	public MenuScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 498, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel icon = new JLabel("");
		java.awt.Image img = new ImageIcon(this.getClass().getResource("/tsicon.png")).getImage();
		icon.setIcon(new ImageIcon(img));
		
		JLabel lblSelectLab = new JLabel("Select Lab: ");
		lblSelectLab.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		JButton button = new JButton("033");
		button.setForeground(new Color(102, 205, 170));
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		button.setBackground(new Color(30, 144, 255));
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Class033 lb33 = new Class033();
			lb33.frameLab33.setVisible(true);
		   }
		});
		
		
		JButton button_1 = new JButton("127");
		button_1.setForeground(new Color(128, 0, 128));
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		button_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			Class127 lb127 = new Class127();
			lb127.frameLab127.setVisible(true);
		   }
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnExit.setForeground(new Color(255, 127, 80));
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
		   }
		});
		
		JLabel lblOtherOptions = new JLabel("Other Options:");
		lblOtherOptions.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(165)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(icon, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExit, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addGap(183))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(93)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSelectLab)
								.addComponent(lblOtherOptions))
							.addGap(276))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(icon, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addComponent(lblSelectLab)
					.addGap(18)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1)
					.addGap(18)
					.addComponent(lblOtherOptions)
					.addGap(18)
					.addComponent(btnExit)
					.addGap(25))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	

}
