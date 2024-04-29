package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class QuanLyPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyPhim frame = new QuanLyPhim();
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
	public QuanLyPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 850);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JPanel panel_5 = new JPanel();
		verticalBox.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Bán vé");
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_5.add(btnNewButton);
		
		btnNewButton.setPreferredSize(new Dimension(20, 50));
			
		JPanel panel_6 = new JPanel();
		verticalBox.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("Quản lý phim");
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		verticalBox.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("Quản lý dịch vụ");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_7.add(btnNewButton_2);
		
		JPanel panel_8 = new JPanel();
		verticalBox.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("Quản lý khách hàng");
		btnNewButton_3.setBackground(new Color(255, 69, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8.add(btnNewButton_3);
		
		JPanel panel_9 = new JPanel();
		verticalBox.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_4 = new JButton("Quản lý nhân viên");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(255, 69, 0));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_9.add(btnNewButton_4);
		
		JPanel panel_10 = new JPanel();
		verticalBox.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_5 = new JButton("Thống kê");
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBackground(new Color(255, 69, 0));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_10.add(btnNewButton_5);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 270));
		verticalBox.add(rigidArea_2);
		
		JPanel panel_11 = new JPanel();
		verticalBox.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_6 = new JButton("Đăng xuất");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(0, 206, 209));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_11.add(btnNewButton_6);
		
		btnNewButton_1.setPreferredSize(new Dimension(20, 50));
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 5));
		panel_6.add(rigidArea_7, BorderLayout.NORTH);
		btnNewButton_2.setPreferredSize(new Dimension(20, 50));
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 5));
		panel_7.add(rigidArea_8, BorderLayout.NORTH);
		btnNewButton_3.setPreferredSize(new Dimension(20, 50));
		
		Component rigidArea_9 = Box.createRigidArea(new Dimension(250, 5));
		panel_8.add(rigidArea_9, BorderLayout.NORTH);
		btnNewButton_4.setPreferredSize(new Dimension(20, 50));
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(0, 5));
		panel_9.add(rigidArea_10, BorderLayout.NORTH);
		btnNewButton_5.setPreferredSize(new Dimension(20, 50));
		
		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 5));
		panel_10.add(rigidArea_11, BorderLayout.NORTH);
		btnNewButton_6.setPreferredSize(new Dimension(250, 50));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox_2 = Box.createVerticalBox();
		panel_3.add(verticalBox_2);
		
		JPanel panel_12 = new JPanel();
		verticalBox_2.add(panel_12);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_12.add(textField);
		textField.setColumns(19);
		
		JButton btnNewButton_7 = new JButton(" Tìm phim ");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(0, 206, 209));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_12.add(btnNewButton_7);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		panel_12.add(rigidArea_4);
		
		JButton btnNewButton_8 = new JButton("Sửa thông tin");
		btnNewButton_8.setBackground(new Color(0, 206, 209));
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_12.add(btnNewButton_8);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		panel_12.add(rigidArea_6);
		
		JButton btnNewButton_9 = new JButton("    Lưu    ");
		btnNewButton_9.setBackground(new Color(0, 206, 209));
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_12.add(btnNewButton_9);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		panel_12.add(rigidArea_3);
		
		JButton btnNewButton_12 = new JButton(" Làm mới ");
		btnNewButton_12.setForeground(new Color(255, 255, 255));
		btnNewButton_12.setBackground(new Color(0, 206, 209));
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_12.add(btnNewButton_12);
		
		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		panel_12.add(rigidArea_13);
		
		JPanel panel_13 = new JPanel();
		verticalBox_2.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox = Box.createHorizontalBox();
		panel_13.add(horizontalBox, BorderLayout.NORTH);
		
		JPanel panel_14 = new JPanel();
		horizontalBox.add(panel_14);
		panel_14.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox_3 = Box.createVerticalBox();
		panel_14.add(verticalBox_3);
		
		JPanel panel_17 = new JPanel();
		verticalBox_3.add(panel_17);
		panel_17.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Mã phim:          ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_17.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_17.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		verticalBox_3.add(panel_18);
		
		JLabel lblNewLabel_3 = new JLabel("Quốc gia:          ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_18.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_18.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_21 = new JPanel();
		verticalBox_3.add(panel_21);
		
		JLabel lblNewLabel_6 = new JLabel("Ngày khỏi chiếu:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_21.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_21.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_24 = new JPanel();
		verticalBox_3.add(panel_24);
		
		JLabel lblNewLabel_9 = new JLabel("Giới hạn tuổi:    ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_24.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_24.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_15 = new JPanel();
		horizontalBox.add(panel_15);
		panel_15.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox_4 = Box.createVerticalBox();
		panel_15.add(verticalBox_4);
		
		JPanel panel_19 = new JPanel();
		verticalBox_4.add(panel_19);
		
		JLabel lblNewLabel_4 = new JLabel("Tên phim:        ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_19.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_19.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_20 = new JPanel();
		verticalBox_4.add(panel_20);
		
		JLabel lblNewLabel_5 = new JLabel("Thời lượng:      ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_20.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_20.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_22 = new JPanel();
		verticalBox_4.add(panel_22);
		
		JLabel lblNewLabel_7 = new JLabel("Ngày kết thúc:  ");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_22.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_22.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_26 = new JPanel();
		verticalBox_4.add(panel_26);
		
		JLabel lblNewLabel_11 = new JLabel("Năm sản xuât:  ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_26.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_26.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		horizontalBox.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_5 = Box.createVerticalBox();
		panel_16.add(verticalBox_5);
		
		JPanel panel_27 = new JPanel();
		verticalBox_5.add(panel_27);
		panel_27.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_12 = new JLabel("Thể loại");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_27.add(lblNewLabel_12);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(230, 20));
		panel_27.add(rigidArea_5);
		
		JPanel panel_28 = new JPanel();
		verticalBox_5.add(panel_28);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		panel_28.add(horizontalBox_1);
		
		JPanel panel_29 = new JPanel();
		horizontalBox_1.add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_6 = Box.createVerticalBox();
		panel_29.add(verticalBox_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hành động");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Viễn tưởng");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Phiêu lưu");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Kinh dị");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(chckbxNewCheckBox_3);
		
		JPanel panel_30 = new JPanel();
		horizontalBox_1.add(panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_7 = Box.createVerticalBox();
		panel_30.add(verticalBox_7);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Tâm lý");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_7.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Tình cảm");
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_7.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Gia đình");
		chckbxNewCheckBox_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_7.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Hài hước");
		chckbxNewCheckBox_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_7.add(chckbxNewCheckBox_7);
		
		JPanel panel_23 = new JPanel();
		verticalBox_2.add(panel_23);
		
		Component rigidArea_12 = Box.createRigidArea(new Dimension(820, 20));
		panel_23.add(rigidArea_12);
		
		JButton btnNewButton_10 = new JButton("Thêm phim");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(0, 206, 209));
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_23.add(btnNewButton_10);
		
		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		panel_23.add(rigidArea_14);
		
		JButton btnNewButton_11 = new JButton(" Xóa phim ");
		btnNewButton_11.setForeground(new Color(255, 255, 255));
		btnNewButton_11.setBackground(new Color(0, 206, 209));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_23.add(btnNewButton_11);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 25));
		// Đặt chiều cao mới cho từng hàng trong bảng
		table.setRowHeight(35);
		// Tăng kích thước của tiêu đề cột
		JTableHeader header = table.getTableHeader();
		Font headerFont = header.getFont();
		header.setFont(new Font(headerFont.getName(), Font.BOLD, 20));

		// Tăng cỡ chữ trong ô dữ liệu của bảng
		Font cellFont = table.getFont();
		table.setFont(new Font(cellFont.getName(), Font.PLAIN, 20));


		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 phim", "T\u00EAn phim", "Qu\u1ED1c gia", "Th\u1EDDi l\u01B0\u1EE3ng", "Ng\u00E0y kh\u1EDFi chi\u1EBFu", "Ng\u00E0y k\u1EBFt th\u00FAc", "Gi\u1EDBi h\u1EA1n tu\u1ED5i", "N\u0103m s\u1EA3n xu\u1EA5t", "Th\u1EC3 lo\u1EA1i"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(3).setPreferredWidth(55);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(6).setPreferredWidth(66);
		scrollPane.setViewportView(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(27, 106, 173));
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_2.add(verticalBox_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 40));
		verticalBox_1.add(rigidArea);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ PHIM");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		verticalBox_1.add(lblNewLabel);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 40));
		verticalBox_1.add(rigidArea_1);
	}
}
