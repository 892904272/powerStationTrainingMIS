package forms.studentManage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.DateChooser;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmplyee extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textBirthday;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmplyee frame = new AddEmplyee();
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
	public AddEmplyee() {
		setTitle("\u6DFB\u52A0\u5458\u5DE5\u4FE1\u606F");
		setBounds(100, 100, 779, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B:");
		lblNewLabel_1.setBounds(440, 48, 81, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("\u51FA\u751F\u65E5\u671F:");
		label.setBounds(15, 106, 81, 46);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7:");
		label_1.setBounds(440, 106, 81, 46);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u90E8\u95E8:");
		label_2.setBounds(15, 167, 81, 46);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("\u8054\u7CFB\u4EBA:");
		lblNewLabel_2.setBounds(440, 167, 81, 46);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("\u804C\u52A1:");
		label_3.setBounds(15, 228, 81, 46);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u5B66\u5386:");
		label_4.setBounds(440, 228, 81, 46);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u59D3\u540D:");
		label_5.setBounds(15, 48, 81, 46);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(111, 55, 173, 33);
		contentPane.add(textField_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(536, 116, 173, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(536, 177, 173, 33);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnMale = new JRadioButton("ÄÐ");
		rdbtnMale.setBounds(532, 57, 55, 29);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Å®");
		rdbtnFemale.setBounds(594, 57, 81, 29);
		contentPane.add(rdbtnFemale);
		
		ButtonGroup  buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnMale);
		buttonGroup.add(rdbtnFemale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<\u8BF7\u9009\u62E9>", "\u5382\u957F", "\u4E3B\u4EFB", "\u73ED\u957F", "\u5458\u5DE5"}));
		comboBox.setBounds(111, 238, 103, 27);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<\u8BF7\u9009\u62E9>", "\u535A\u58EB", "\u7855\u58EB", "\u672C\u79D1", "\u4E13\u79D1"}));
		comboBox_1.setBounds(536, 238, 103, 27);
		contentPane.add(comboBox_1);
		
		textBirthday = new JTextField();
		textBirthday.setColumns(10);
		textBirthday.setBounds(111, 113, 173, 33);
		DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
		dateChooser1.register(textBirthday);
		contentPane.add(textBirthday);
		
		JButton btnNewButton = new JButton("±£´æ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(161, 289, 123, 39);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("ÍË³ö");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button.setBounds(440, 289, 123, 39);
		contentPane.add(button);
	}
}
