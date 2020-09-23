package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class ReportFormPage {

	JFrame frameRP;
	private JTextArea textField;
	private JTextField textField_1;

	
	protected JTextArea reportContent;
	protected JTextField recipiant;
	public JLabel send;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportFormPage window = new ReportFormPage();
					window.frameRP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReportFormPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameRP = new JFrame();
		frameRP.getContentPane().setBackground(Color.WHITE);
		frameRP.setBackground(new Color(255, 255, 255));
		frameRP.setBounds(100, 100, 732, 507);
		frameRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Class033 cl33 = new Class033();
		Class127 cl127 = new Class127();
		String contentsOfEmail = cl33.selectedPCs() + cl127.selectedPCs();
		reportContent = new JTextArea();
		reportContent.setText(contentsOfEmail);
		recipiant = new JTextField();
		recipiant.setText(null);
		
		JLabel lblCreateAReport = new JLabel("Create a Report");
		lblCreateAReport.setForeground(new Color(255, 127, 80));
		lblCreateAReport.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		textField = new JTextArea();
		textField.setBackground(UIManager.getColor("CheckBox.background"));
		textField.setForeground(new Color(0, 0, 0));
		textField.setColumns(10);
		textField.setText(contentsOfEmail);
		
		JLabel lblWriteDownThe = new JLabel("Write down the issues found for each individual computer: ");
		lblWriteDownThe.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(148, 0, 211));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DeliverReport.deliver(recipiant.getText(),"Defective Computers in Computer Labs", reportContent,"dummyemail@bing.com");
				recipiant.setText(null);
				JOptionPane.showMessageDialog(null,"Report Sent to Admin!");
			}
		});
		
		JButton btnNewButton_1 = new JButton("< Back to Menu");
		btnNewButton_1.setForeground(new Color(199, 21, 133));
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frameRP.setVisible(false);
				MenuScreen menu = new MenuScreen();
				menu.frame.setVisible(true);
			   }
			});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
		   }
		});
		
		btnExit.setForeground(new Color(154, 205, 50));
		
		textField_1 = new JTextField();
		textField_1.setBackground(UIManager.getColor("CheckBox.background"));
		textField_1.setColumns(10);
		
		JLabel lblEmailOfIt = new JLabel("Email of IT Administrator:");
		lblEmailOfIt.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(frameRP.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEmailOfIt)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(btnExit)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(btnNewButton_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton))
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 565, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField_1, Alignment.LEADING)
										.addComponent(lblWriteDownThe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addContainerGap(42, Short.MAX_VALUE))
							.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addComponent(lblCreateAReport)
								.addGap(251)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblCreateAReport)
					.addGap(29)
					.addComponent(lblEmailOfIt)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(lblWriteDownThe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_1))
							.addContainerGap())
						.addComponent(btnExit)))
		);
		frameRP.getContentPane().setLayout(groupLayout);
	}
  }

