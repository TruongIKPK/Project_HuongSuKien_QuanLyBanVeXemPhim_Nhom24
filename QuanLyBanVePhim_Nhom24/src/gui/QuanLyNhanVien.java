package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
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
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class QuanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_5;
	private JLabel lblThoiGian;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNhanVien frame = new QuanLyNhanVien();
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
	public QuanLyNhanVien() {
		setTitle("Quản Lý Nhân Viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1457, 910);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setForeground(new Color(0, 0, 255));
		panel.setBounds(0, 0, 2079, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(596, 78, 347, 60);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Th\u00F4ng tin nh\u00E2n vi\u00EAn", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(242, 352, 969, 344);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã nhân viên: ");
		lblNewLabel_1.setBounds(48, 79, 190, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_1_1.setBounds(48, 162, 148, 21);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Số điện thoại:");
		lblNewLabel_1_2.setBounds(58, 242, 134, 21);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tên nhân viên:");
		lblNewLabel_1_3.setBounds(511, 86, 134, 21);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Phái:");
		lblNewLabel_1_4.setBounds(511, 162, 95, 21);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Email: ");
		lblNewLabel_1_5.setBounds(511, 242, 108, 21);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(202, 160, 190, 30);
		panel_1.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(655, 161, 85, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		rdbtnN.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		buttonGroup.add(rdbtnN);
		rdbtnN.setBounds(742, 161, 77, 23);
		panel_1.add(rdbtnN);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(202, 77, 190, 35);
		panel_1.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(202, 240, 190, 30);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(655, 79, 190, 33);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(655, 240, 190, 30);
		panel_1.add(textField_4);
		
		JButton btnNewButton_3_1 = new JButton("Sửa");
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_3_1.setBounds(402, 160, 85, 30);
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Sửa");
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_3_2.setBounds(402, 238, 85, 32);
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_2_1 = new JButton("Sửa");
		btnNewButton_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_3_2_1.setBounds(855, 81, 85, 32);
		panel_1.add(btnNewButton_3_2_1);
		
		JButton btnNewButton_3_2_2 = new JButton("Sửa");
		btnNewButton_3_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_3_2_2.setBounds(855, 242, 85, 32);
		panel_1.add(btnNewButton_3_2_2);
		
		JButton btnNewButton_3_2_1_1 = new JButton("Sửa");
		btnNewButton_3_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_3_2_1_1.setBounds(855, 151, 85, 32);
		panel_1.add(btnNewButton_3_2_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(242, 209, 969, 92);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Thông tin tìm kiếm:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(113, 34, 191, 27);
		panel_2.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(317, 34, 221, 28);
		panel_2.add(textField_5);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.setBounds(580, 34, 89, 28);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(242, 707, 969, 92);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1.setBounds(130, 26, 123, 37);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Xoá");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.setBounds(338, 26, 123, 37);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Xoá trắng");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_2.setBounds(514, 26, 123, 37);
		panel_3.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nhân viên: ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(1241, 732, 202, 28);
		contentPane.add(lblNewLabel_3);
		
		lblThoiGian = new JLabel("");
		lblThoiGian.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblThoiGian.setBounds(1241, 777, 223, 28);
		contentPane.add(lblThoiGian);
		updateTime();
		
		JButton btnNewButton_2 = new JButton("Thoát");
		btnNewButton_2.setBorder(BorderFactory.createEmptyBorder());
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2.setBounds(1253, 835, 164, 49);
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
