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

public class Class033 {

	JFrame frameLab33;
	public static String notify = ""; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class033 window = new Class033();
					window.frameLab33.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Class033() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLab33 = new JFrame();
		frameLab33.getContentPane().setBackground(new Color(255, 255, 255));
		frameLab33.setBounds(100, 100, 815, 716);
		frameLab33.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblLab = new JLabel("Lab 033");
		lblLab.setForeground(new Color(255, 99, 71));
		lblLab.setFont(new Font("Lucida Grande", Font.PLAIN, 30));

		JButton btnReportIssues = new JButton("Proceed >");
		btnReportIssues.setForeground(new Color(153, 50, 204));
		btnReportIssues.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frameLab33.setVisible(false);
				ReportFormPage rp = new ReportFormPage();
				rp.frameRP.setVisible(true);
			   }
			});
			

		JButton btnNewButton = new JButton("< Back");
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frameLab33.setVisible(false);
				MenuScreen menu = new MenuScreen();
				menu.frame.setVisible(true);
			   }
			});
		
		JLabel pcs4to6 = new JLabel("");
		java.awt.Image img = new ImageIcon(this.getClass().getResource("/pcimage3.jpg")).getImage();
		pcs4to6.setIcon(new ImageIcon(img));
		
		JLabel pcs1to3 = new JLabel("");
		pcs1to3.setIcon(new ImageIcon(img));
		
		JLabel tpc = new JLabel("");
		java.awt.Image img2 = new ImageIcon(this.getClass().getResource("/pcimage.jpg")).getImage();
		tpc.setIcon(new ImageIcon(img2));
		
		JLabel pcs10to13 = new JLabel("");
		pcs10to13.setIcon(new ImageIcon(img));

		JLabel pcs7to9 = new JLabel("");
		pcs7to9.setIcon(new ImageIcon(img));
		
		JLabel pcs15to17 = new JLabel("");
		pcs15to17.setIcon(new ImageIcon(img));

		JLabel pcs18to20 = new JLabel("");
		pcs18to20.setIcon(new ImageIcon(img));

		JLabel pcs13to14 = new JLabel("");
		java.awt.Image img3 = new ImageIcon(this.getClass().getResource("/pcimage2.jpg")).getImage();
		pcs13to14.setIcon(new ImageIcon(img3));
		
		JRadioButton rdbtnTeachersPc = new JRadioButton("Teachers PC");
		rdbtnTeachersPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnTeachersPc.isSelected()) {
					notify += "Defective (Teacher's PC)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc = new JRadioButton("PC-6");
		rdbtnPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc.isSelected()) {
					notify += "Defective (PC-6)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_1 = new JRadioButton("PC-5");
		rdbtnPc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_1.isSelected()) {
					notify += "Defective (PC-5)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_2 = new JRadioButton("PC-4");
		rdbtnPc_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_2.isSelected()) {
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
		
		JRadioButton rdbtnPc_4 = new JRadioButton("PC-2");
		rdbtnPc_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_3.isSelected()) {
					notify += "Defective  (PC-2)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_5 = new JRadioButton("PC-1");
		rdbtnPc_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_5.isSelected()) {
					notify += "Defective  (PC-1)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_11 = new JRadioButton("PC-12");
		rdbtnPc_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_11.isSelected()) {
					notify += "Defective  (PC-12)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_10 = new JRadioButton("PC-11");
		rdbtnPc_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_10.isSelected()) {
					notify += "Defective  (PC-11)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_9 = new JRadioButton("PC-10");
		rdbtnPc_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_9.isSelected()) {
					notify += "Defective  (PC-10)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_8 = new JRadioButton("PC-9");
		rdbtnPc_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_8.isSelected()) {
					notify += "Defective  (PC-9)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_7 = new JRadioButton("PC-8");
		rdbtnPc_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_7.isSelected()) {
					notify += "Defective  (PC-8)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_6 = new JRadioButton("PC-7");
		rdbtnPc_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_6.isSelected()) {
					notify += "Defective  (PC-7)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_16 = new JRadioButton("PC-17");
		rdbtnPc_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_16.isSelected()) {
					notify += "Defective  (PC-17)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_15 = new JRadioButton("PC-16");
		rdbtnPc_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_15.isSelected()) {
					notify += "Defective  (PC-16)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_14 = new JRadioButton("PC-15");
		rdbtnPc_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_14.isSelected()) {
					notify += "Defective  (PC-15)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_13 = new JRadioButton("PC-14");
		rdbtnPc_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_13.isSelected()) {
					notify += "Defective  (PC-14)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_12 = new JRadioButton("PC-13");
		rdbtnPc_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_12.isSelected()) {
					notify += "Defective  (PC-13\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_19 = new JRadioButton("PC-20");
		rdbtnPc_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_19.isSelected()) {
					notify += "Defective  (PC-20)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_18 = new JRadioButton("PC-19");
		rdbtnPc_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_18.isSelected()) {
					notify += "Defective  (PC-19)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JRadioButton rdbtnPc_17 = new JRadioButton("PC-18");
		rdbtnPc_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPc_17.isSelected()) {
					notify += "Defective (PC-18)\n";
				} else {
					notify = "";
				}
			}
		});
		
		JLabel lblSelectDefectiveComputers = new JLabel("Select Defective Computers:");

		GroupLayout groupLayout = new GroupLayout(frameLab33.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tpc, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
									.addGap(131)
									.addComponent(lblSelectDefectiveComputers))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(pcs10to13, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(pcs7to9, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(pcs4to6)
										.addGap(18)
										.addComponent(pcs1to3, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(pcs18to20, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
											.addComponent(pcs15to17, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
											.addGroup(groupLayout.createSequentialGroup()
												.addGap(14)
												.addComponent(rdbtnPc_19, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
												.addGap(36)
												.addComponent(rdbtnPc_18, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
												.addGap(35)
												.addComponent(rdbtnPc_17, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
										.addGap(101)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(pcs13to14, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(btnNewButton)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnReportIssues)))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(347)
							.addComponent(lblLab)))
					.addGap(70))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(rdbtnTeachersPc)
					.addContainerGap(667, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addComponent(rdbtnPc, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(rdbtnPc_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(rdbtnPc_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(rdbtnPc_3, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(rdbtnPc_4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(rdbtnPc_5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(88, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(rdbtnPc_11, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(rdbtnPc_10, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(rdbtnPc_9, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(51)
					.addComponent(rdbtnPc_8, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(rdbtnPc_7, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(rdbtnPc_6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(90, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(rdbtnPc_16, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(rdbtnPc_15, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(rdbtnPc_14, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(139)
					.addComponent(rdbtnPc_13, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(rdbtnPc_12, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLab)
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(tpc, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(rdbtnTeachersPc))
						.addComponent(lblSelectDefectiveComputers))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pcs1to3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(pcs4to6, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnPc)
							.addComponent(rdbtnPc_1)
							.addComponent(rdbtnPc_2))
						.addComponent(rdbtnPc_3)
						.addComponent(rdbtnPc_4)
						.addComponent(rdbtnPc_5))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pcs10to13, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(pcs7to9, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addComponent(rdbtnPc_11))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnPc_9)
										.addComponent(rdbtnPc_10))))
							.addGap(18)
							.addComponent(pcs15to17, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPc_8)
								.addComponent(rdbtnPc_7)
								.addComponent(rdbtnPc_6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pcs13to14, GroupLayout.PREFERRED_SIZE, 96, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnPc_16)
						.addComponent(rdbtnPc_15)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(rdbtnPc_14)
							.addComponent(rdbtnPc_13)
							.addComponent(rdbtnPc_12)))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnReportIssues)
								.addComponent(btnNewButton))
							.addGap(21))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pcs18to20, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnPc_19)
								.addComponent(rdbtnPc_18)
								.addComponent(rdbtnPc_17))
							.addContainerGap())))
		);
		frameLab33.getContentPane().setLayout(groupLayout);
	}
	
	public String selectedPCs() {
		return notify;
	}
}
