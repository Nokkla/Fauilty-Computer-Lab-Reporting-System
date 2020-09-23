package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Class127 {

	JFrame frameLab127;
	public static String notify = ""; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class127 window = new Class127();
					window.frameLab127.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Class127() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLab127 = new JFrame();
		frameLab127.getContentPane().setBackground(new Color(255, 255, 255));
		frameLab127.setBounds(100, 100, 925, 564);
		frameLab127.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblLab = new JLabel("Lab 127");
		lblLab.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblLab.setForeground(new Color(255, 127, 80));
		
		JLabel pcs6to10 = new JLabel("");
		java.awt.Image img4 = new ImageIcon(this.getClass().getResource("/pcimage5.jpg")).getImage();
		pcs6to10.setIcon(new ImageIcon(img4));
		
		JLabel tpc = new JLabel("");
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/pcimage.jpg")).getImage();
		tpc.setIcon(new ImageIcon(img2));
		
		JLabel pcs1to5 = new JLabel("");
		pcs1to5.setIcon(new ImageIcon(img4));
		
		JLabel pcs16to20 = new JLabel("");
		pcs16to20.setIcon(new ImageIcon(img4));

		JLabel pcs11to15 = new JLabel("");
		pcs11to15.setIcon(new ImageIcon(img4));

		JButton btnNewButton = new JButton("Proceed >");
		btnNewButton.setForeground(new Color(153, 50, 204));
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frameLab127.setVisible(false);
				ReportFormPage rp = new ReportFormPage();
				rp.frameRP.setVisible(true);
			   }
			});
		
		JButton button = new JButton("< Back");
		button.setForeground(new Color(199, 21, 133));
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frameLab127.setVisible(false);
				MenuScreen menu = new MenuScreen();
				menu.frame.setVisible(true);
			   }
			});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teacher's PC");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					notify += "Defective (Teacher's PC)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc = new JRadioButton("PC-10");
		rdbtnPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc.isSelected()) {
					notify += "Defective (PC-10)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_9 = new JRadioButton("PC-9");
		rdbtnPc_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_9.isSelected()) {
					notify += "Defective (PC-9)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_8 = new JRadioButton("PC-8");
		rdbtnPc_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_8.isSelected()) {
					notify += "Defective (PC-8)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_7 = new JRadioButton("PC-7");
		rdbtnPc_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_7.isSelected()) {
					notify += "Defective (PC-7)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_6 = new JRadioButton("PC-6");
		rdbtnPc_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_6.isSelected()) {
					notify += "Defective (PC-6)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_5 = new JRadioButton("PC-5");
		rdbtnPc_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_5.isSelected()) {
					notify += "Defective (PC-5)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_4 = new JRadioButton("PC-4");
		rdbtnPc_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_4.isSelected()) {
					notify += "Defective (PC-4)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_3 = new JRadioButton("PC-3");
		rdbtnPc_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_3.isSelected()) {
					notify += "Defective (PC-3)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_2 = new JRadioButton("PC-2");
		rdbtnPc_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_2.isSelected()) {
					notify += "Defective (PC-2)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_1 = new JRadioButton("PC-1");
		rdbtnPc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_1.isSelected()) {
					notify += "Defective (PC-1)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_10 = new JRadioButton("PC-20");
		rdbtnPc_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_10.isSelected()) {
					notify += "Defective (PC-20)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_11 = new JRadioButton("PC-19");
		rdbtnPc_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_11.isSelected()) {
					notify += "Defective (PC-19)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_12 = new JRadioButton("PC-18");
		rdbtnPc_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_12.isSelected()) {
					notify += "Defective (PC-18)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_13 = new JRadioButton("PC-17");
		rdbtnPc_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_13.isSelected()) {
					notify += "Defective (PC-17)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_14 = new JRadioButton("PC-16");
		rdbtnPc_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_14.isSelected()) {
					notify += "Defective (PC-16)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_15 = new JRadioButton("PC-15");
		rdbtnPc_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_15.isSelected()) {
					notify += "Defective (PC-15)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_16 = new JRadioButton("PC-14");
		rdbtnPc_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_16.isSelected()) {
					notify += "Defective (PC-14)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_17 = new JRadioButton("PC-13");
		rdbtnPc_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_17.isSelected()) {
					notify += "Defective (PC-13)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_18 = new JRadioButton("PC-12");
		rdbtnPc_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_18.isSelected()) {
					notify += "Defective (PC-12)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_19 = new JRadioButton("PC-11");
		rdbtnPc_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_19.isSelected()) {
					notify += "Defective (PC-11)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JLabel lblSelectDefectiveComputers = new JLabel("Select Defective Computers: ");
		
		GroupLayout groupLayout = new GroupLayout(frameLab127.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tpc)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(254)
									.addComponent(lblLab))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(216)
									.addComponent(lblSelectDefectiveComputers))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pcs6to10)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addComponent(rdbtnPc_5, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_4, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnPc_1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
								.addComponent(pcs1to5, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(pcs16to20, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnPc_10, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(rdbtnPc_11, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(rdbtnPc_12, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(17)
									.addComponent(rdbtnPc_13, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnPc_14, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(rdbtnPc_15, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(rdbtnPc_16, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_17, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_18, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(rdbtnPc_19, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
								.addComponent(pcs11to15, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(683, Short.MAX_VALUE)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(45))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(rdbtnNewRadioButton)
					.addContainerGap(793, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(rdbtnPc)
					.addGap(29)
					.addComponent(rdbtnPc_9, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnPc_8, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnPc_7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnPc_6, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(485, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(tpc, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(lblLab)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSelectDefectiveComputers)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnNewRadioButton)
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pcs1to5, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPc_5)
								.addComponent(rdbtnPc_4)
								.addComponent(rdbtnPc_3)
								.addComponent(rdbtnPc_2)
								.addComponent(rdbtnPc_1)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pcs6to10, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPc)
								.addComponent(rdbtnPc_9)
								.addComponent(rdbtnPc_8)
								.addComponent(rdbtnPc_7)
								.addComponent(rdbtnPc_6))))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pcs16to20, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPc_10)
								.addComponent(rdbtnPc_11)
								.addComponent(rdbtnPc_12)
								.addComponent(rdbtnPc_13)
								.addComponent(rdbtnPc_16)
								.addComponent(rdbtnPc_17)
								.addComponent(rdbtnPc_18)
								.addComponent(rdbtnPc_19)
								.addComponent(rdbtnPc_15)
								.addComponent(rdbtnPc_14)))
						.addComponent(pcs11to15, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button))
					.addGap(15))
		);
		frameLab127.getContentPane().setLayout(groupLayout);
	}
	public String selectedPCs() {
		return notify;
	}
}
