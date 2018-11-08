package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7535\u5382\u57F9\u8BAD\u7BA1\u7406\u7CFB\u7EDF");
		label.setFont(new Font("华文新魏", Font.BOLD | Font.ITALIC, 58));
		label.setForeground(Color.BLUE);
		label.setBounds(15, 15, 515, 113);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u7528\u6237\u540D:");
		label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		label_1.setBounds(105, 136, 105, 52);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(232, 143, 161, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5BC6  \u7801:");
		label_2.setFont(new Font("宋体", Font.PLAIN, 25));
		label_2.setBounds(105, 210, 105, 38);
		contentPane.add(label_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(232, 207, 161, 41);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setBounds(87, 285, 123, 40);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterForm rf = new RegisterForm();
				//setVisible(flase);
				rf.setVisible(true);
			}
		});
		button.setBounds(335, 285, 123, 40);
		contentPane.add(button);
	}
}
