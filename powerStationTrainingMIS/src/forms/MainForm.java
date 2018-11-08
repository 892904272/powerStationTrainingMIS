package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import forms.studentManage.EmployeeManage;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;

public class MainForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setTitle("\u7535\u5382\u57F9\u8BAD\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6B22\u8FCE\u4F7F\u7528\u7535\u5382\u57F9\u8BAD\u7BA1\u7406\u7CFB\u7EDF");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("»ªÎÄ²ÊÔÆ", Font.BOLD | Font.ITALIC, 40));
		label.setBounds(15, 15, 518, 99);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(568, 15, 271, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton updatePsw = new JButton("\u4FEE\u6539\u5BC6\u7801");
		updatePsw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		updatePsw.setBounds(15, 70, 105, 29);
		panel.add(updatePsw);
		
		JButton exitLogin = new JButton("\u9000\u51FA\u767B\u5F55");
		exitLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		exitLogin.setBounds(151, 70, 105, 29);
		panel.add(exitLogin);
		
		JLabel label_1 = new JLabel("\u7528\u6237:");
		label_1.setBounds(15, 27, 81, 21);
		panel.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(111, 27, 81, 21);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(15, 129, 809, 31);
		contentPane.add(menuBar);
		
		JMenu planManage = new JMenu("\u57F9\u8BAD\u8BA1\u5212\u7BA1\u7406");
		menuBar.add(planManage);
		
		JMenuItem planAdd = new JMenuItem("\u6DFB\u52A0");
		planManage.add(planAdd);
		
		JMenuItem planDelete = new JMenuItem("\u5220\u9664");
		planManage.add(planDelete);
		
		JMenuItem planModify = new JMenuItem("\u4FEE\u6539");
		planManage.add(planModify);
		
		JMenuItem planQuery = new JMenuItem("\u67E5\u8BE2");
		planManage.add(planQuery);
		
		JMenu scoreManage = new JMenu("\u57F9\u8BAD\u6210\u7EE9\u7BA1\u7406");
		menuBar.add(scoreManage);
		
		JMenuItem scoreEntry = new JMenuItem("\u5F55\u5165");
		scoreManage.add(scoreEntry);
		
		JMenuItem scoreModify = new JMenuItem("\u4FEE\u6539");
		scoreManage.add(scoreModify);
		
		JMenuItem scoreQuery = new JMenuItem("\u67E5\u8BE2");
		scoreManage.add(scoreQuery);
		
		JMenu checkManage = new JMenu("\u57F9\u8BAD\u8003\u52E4\u7BA1\u7406");
		menuBar.add(checkManage);
		
		JMenuItem checkQuery = new JMenuItem("\u67E5\u8BE2");
		checkManage.add(checkQuery);
		
		JMenuItem checkStatistics = new JMenuItem("\u7EDF\u8BA1");
		checkManage.add(checkStatistics);
		
		JMenu studentManage = new JMenu("\u5B66\u5458\u7BA1\u7406");
		menuBar.add(studentManage);
		
		JMenuItem departmentManage = new JMenuItem("\u90E8\u95E8\u7BA1\u7406");
		studentManage.add(departmentManage);
		
		JMenuItem studentInfoManage = new JMenuItem("\u5B66\u5458\u57FA\u672C\u4FE1\u606F\u7BA1\u7406");
		studentInfoManage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//MainForm MF = new MainForm();
				showEmployeeManage();
			}
		});
		studentManage.add(studentInfoManage);
		
		JMenuItem studyRecordManage = new JMenuItem("\u5B66\u4E60\u8BB0\u5F55\u7BA1\u7406");
		studentManage.add(studyRecordManage);
		
		JMenu systemManage = new JMenu("\u7CFB\u7EDF\u7BA1\u7406");
		menuBar.add(systemManage);
		
		JMenuItem userManage = new JMenuItem("\u7528\u6237\u7BA1\u7406");
		systemManage.add(userManage);
		
		/*JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 173, 824, 424);
		panel_1.setLayout(null);
		contentPane.add(panel_1);*/
		
		
	}
	private void showEmployeeManage(){
		EmployeeManage emf = new EmployeeManage();
		emf.setBounds(15, 173, 824, 424);
		emf.setLayout(null);
		contentPane.add(emf);
		//setContentPane(emf);
		emf.setVisible(true);
	}
}
