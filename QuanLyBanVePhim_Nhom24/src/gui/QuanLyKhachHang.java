package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.BorderFactory;

public class QuanLyKhachHang extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblThoiGian;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhachHang frame = new QuanLyKhachHang();
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
	public QuanLyKhachHang() {
		setTitle("Quản lý khách hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1692, 914);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1961, 152);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ KHÁCH HÀNG");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(498, 69, 478, 51);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(153, 293, 1092, 254);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã khách hàng: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(90, 47, 166, 31);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ngày sinh: ");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(90, 116, 166, 31);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Số điện thoại: ");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2.setBounds(90, 184, 166, 31);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Tên khách hàng: ");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_3.setBounds(575, 47, 166, 31);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Phái: ");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_4.setBounds(575, 116, 166, 31);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Điểm tích luỹ: ");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_5.setBounds(575, 184, 166, 31);
		panel_1.add(lblNewLabel_2_5);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(250, 43, 212, 35);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(751, 43, 212, 35);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(250, 116, 212, 35);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(250, 184, 212, 35);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(751, 180, 212, 35);
		panel_1.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		rdbtnNewRadioButton.setBounds(747, 123, 87, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnN);
		rdbtnN.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		rdbtnN.setBounds(836, 124, 87, 23);
		panel_1.add(rdbtnN);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1.setBounds(472, 182, 78, 35);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.setBounds(472, 116, 78, 35);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Sửa");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_2.setBounds(973, 43, 78, 35);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Sửa");
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_3.setBounds(973, 116, 78, 35);
		panel_1.add(btnNewButton_1_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(154, 180, 1115, 85);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin tìm kiếm: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(51, 27, 189, 35);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField.setBounds(263, 27, 252, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.setBounds(567, 30, 89, 28);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(153, 579, 1104, 82);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1_1_1 = new JButton("Xoá trắng");
		btnNewButton_1_1_1.setBounds(749, 22, 133, 35);
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Xoá ");
		btnNewButton_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_1.setBounds(473, 22, 133, 35);
		panel_3.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Thêm");
		btnNewButton_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_2.setBounds(213, 22, 133, 35);
		panel_3.add(btnNewButton_1_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nhân viên: ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(1364, 687, 202, 28);
		contentPane.add(lblNewLabel_3);
		
		lblThoiGian = new JLabel("2024-04-23 18:53:50");
		lblThoiGian.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblThoiGian.setBounds(1364, 732, 223, 28);
		contentPane.add(lblThoiGian);
		updateTime();
		
		JButton btnNewButton_2 = new JButton("Thoát");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(1376, 790, 164, 49);
		contentPane.add(btnNewButton_2);
	}
	private String updateTime() {
		// Lấy thời gian hiện tại
		Date currentTimeDate = new Date();

		// Định dạng thời gian
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String formattedTime = dateFormat.format(currentTimeDate);

		// Hiển thị thời gian trên jlbl
		lblThoiGian.setText(formattedTime+"");
		Timer timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				autoInputData();
			}
		});
		timer.start();

		return formattedTime;
	}
	private void autoInputData() {
		lblThoiGian.setText(updateTime());
	}
}
