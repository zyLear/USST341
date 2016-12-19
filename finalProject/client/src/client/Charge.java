package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Charge extends JFrame {

	private JPanel contentPane;
	private JTextField age;
	private JTextField sex;
	private JTextField name;
	private ButtonGroup bg=new ButtonGroup();
	static public JLabel notice;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Charge frame = new Charge();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Charge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		CardLayout card=new CardLayout(0, 0);
		contentPane.setLayout(card);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "main");
		panel.setLayout(null);
		
		
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(289, 225, 106, 21);
		panel.add(age);
		
		sex = new JTextField();
		sex.setColumns(10);
		sex.setBounds(289, 181, 106, 21);
		panel.add(sex);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(289, 141, 106, 21);
		panel.add(name);
		
		JLabel label = new JLabel("\u59D3\u540D\uFF1A");
		label.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label.setBounds(176, 142, 54, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u6027\u522B\uFF1A");
		label_1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_1.setBounds(176, 186, 54, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u5E74\u9F84\uFF1A");
		label_2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_2.setBounds(176, 231, 54, 15);
		panel.add(label_2);
		
		JButton button = new JButton("\u67E5\u770B\u9884\u7EA6\u75C5\u4EBA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				card.show(contentPane, "predict");
			}
		});
		button.setBounds(85, 307, 145, 33);
		panel.add(button);
		
		notice = new JLabel("\u6302\u53F7\u6D88\u606F");
		notice.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		notice.setHorizontalAlignment(SwingConstants.CENTER);
		notice.setBounds(85, 40, 428, 57);
		panel.add(notice);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "charge");
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("\u4ED8\u6B3E");
		btnNewButton_3.setBounds(277, 333, 106, 35);
		panel_2.add(btnNewButton_3);
		
		JButton button_3 = new JButton("\u8FD4\u56DE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "main");
			}
		});
		button_3.setBounds(509, 333, 106, 35);
		panel_2.add(button_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(135, 135, 106, 21);
		panel_2.add(textField);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 217, 231, 174);
		panel_2.add(textArea);
		
		JLabel label_4 = new JLabel("\u836F\u54C1\u4FE1\u606F");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		label_4.setBounds(36, 177, 179, 30);
		panel_2.add(label_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(277, 41, 343, 201);
		panel_2.add(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(135, 91, 106, 21);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(135, 51, 106, 21);
		panel_2.add(textField_2);
		
		JLabel label_5 = new JLabel("\u5F53\u524D\u4ED8\u6B3E\u7684\u4EBA");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		label_5.setBounds(36, 0, 179, 30);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("\u59D3\u540D\uFF1A");
		label_6.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_6.setBounds(22, 52, 54, 15);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("\u6027\u522B\uFF1A");
		label_7.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_7.setBounds(22, 96, 54, 16);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("\u5E74\u9F84\uFF1A");
		label_8.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		label_8.setBounds(22, 141, 54, 15);
		panel_2.add(label_8);
		
		JButton button_4 = new JButton("\u4E0B\u4E00\u4E2A");
		button_4.setBounds(393, 333, 106, 35);
		panel_2.add(button_4);
		
		JLabel label_9 = new JLabel("\u5F53\u524D\u7B49\u5F85\u961F\u5217");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		label_9.setBounds(360, 1, 179, 30);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("\u9700\u4ED8\u6B3E");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		label_10.setBounds(322, 273, 251, 30);
		panel_2.add(label_10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "predict");
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A\u6302\u53F7");
		btnNewButton.setBounds(181, 321, 93, 23);
		panel_1.add(btnNewButton);
		
		JTextArea txtrDsf = new JTextArea();
		txtrDsf.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		txtrDsf.setText("dsf ");
		txtrDsf.setBounds(51, 66, 512, 178);
		panel_1.add(txtrDsf);
		
		JLabel label_3 = new JLabel("\u9884\u7EA6\u961F\u5217");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		label_3.setBounds(199, 26, 179, 30);
		panel_1.add(label_3);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane,"main");
			}
		});
		button_1.setBounds(300, 321, 93, 23);
		panel_1.add(button_1);
		
		
		
		JLabel lable111 = new JLabel("\u79D1\uFF1A");
		lable111.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		lable111.setBounds(176, 267, 54, 15);
		panel.add(lable111);
		
		JRadioButton internal = new JRadioButton("\u5185\u79D1",true);
		internal.setBounds(276, 265, 54, 23);
		panel.add(internal);
		
		JRadioButton surgery = new JRadioButton("\u5916\u79D1");
		surgery.setBounds(341, 265, 54, 23);
		panel.add(surgery);
		
		//JRadioButton radioButton_2 = new JRadioButton("\u4E13\u79D1");
	//	radioButton_2.setBounds(409, 265, 54, 23);
		//panel.add(radioButton_2);
		bg.add(surgery);
		bg.add(internal);
		
		JButton btnNewButton_1 = new JButton("\u786E\u5B9A\u6302\u53F7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String department = null;
				if(internal.isSelected()){
					department="internal";
				}
				else if(surgery.isSelected()){
					department="surgery";
				}
				ClientChargeThread.Send(department, name.getText(), sex.getText(), age.getText());
				notice.setText("�ȴ��Һ���Ϣ");
			}
		});
		btnNewButton_1.setBounds(389, 307, 139, 33);
		panel.add(btnNewButton_1);
		
		JButton button_2 = new JButton("\u6536\u8D39");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(contentPane, "charge");
			}
		});
		button_2.setBounds(240, 307, 139, 33);
		panel.add(button_2);
		
		
	}
}
