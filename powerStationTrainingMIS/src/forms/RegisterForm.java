package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label_1;
	private JPasswordField passwordField;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D:");
		label.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		label.setBounds(116, 67, 105, 52);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(247, 76, 161, 40);
		contentPane.add(textField);
		
		label_1 = new JLabel("\u5BC6  \u7801:");
		label_1.setFont(new Font("ËÎÌו", Font.PLAIN, 25));
		label_1.setBounds(116, 163, 105, 38);
		contentPane.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(247, 164, 161, 41);
		contentPane.add(passwordField);
		
		button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(98, 272, 123, 40);
		contentPane.add(button);
		
		button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(348, 272, 123, 40);
		contentPane.add(button_1);
	}

}
