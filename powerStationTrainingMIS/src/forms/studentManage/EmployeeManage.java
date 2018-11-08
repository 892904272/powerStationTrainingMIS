package forms.studentManage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import services.user.User;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class EmployeeManage extends JPanel {
	
	private JTextField textField;
	private JTable tblEmployee;
	private Vector<String> colums=new Vector<String>();
	private Vector<Vector<Object>> tableDatas = new User().getAllUsers();
	/**
	 * Create the panel.
	 */
	public EmployeeManage() {
		setBounds(15, 173, 824, 424);
		setLayout(null);
		JLabel lblNewLabel = new JLabel("\u59D3\u540D:");
		lblNewLabel.setBounds(15, 36, 81, 21);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(69, 33, 166, 27);
		add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u6027\u522B:");
		label.setBounds(389, 36, 81, 21);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		comboBox.setBounds(451, 33, 50, 27);
		add(comboBox);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBounds(604, 32, 123, 29);
		add(button);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddEmplyee ae = new AddEmplyee();
				ae.setVisible(true);
			}
		});
		btnNewButton.setBounds(15, 75, 123, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5220\u9664");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(169, 75, 123, 29);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u4FEE\u6539");
		btnNewButton_2.setBounds(323, 75, 123, 29);
		add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 110, 712, 251);
		add(scrollPane);
		
		tblEmployee = new JTable();
		tblEmployee.setBackground(SystemColor.menu);
		colums.add("姓名");
		colums.add("性别");
		colums.add("出生年月");
		colums.add("身份证");
		colums.add("部门");
		colums.add("联系方式");
		colums.add("职务");
		colums.add("学历");
		DefaultTableModel tableModel = new DefaultTableModel(tableDatas,colums);
		RowSorter sorter = new TableRowSorter<DefaultTableModel>(tableModel);
		//tableModel.setDataVector(, colums);
		tblEmployee.setModel(tableModel);
		
		scrollPane.setViewportView(tblEmployee);
		
		System.out.println("到达学员基本信息管理界面");
		
		setVisible(true);
	}
}
