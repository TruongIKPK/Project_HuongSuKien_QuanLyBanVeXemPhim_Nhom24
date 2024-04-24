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
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Insets;

public class QuanLyNhanVien extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblThoiGian;

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
		setBounds(100, 100, 1936, 1163);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0));
		panel.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2.add(lblNewLabel, BorderLayout.CENTER);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(1920, 46));
		panel_2.add(rigidArea_1, BorderLayout.SOUTH);
		
		Component rigidArea = Box.createRigidArea(new Dimension(1920, 52));
		panel_2.add(rigidArea, BorderLayout.NORTH);
		
		Component horizontalStrut = Box.createHorizontalStrut(464);
		panel_2.add(horizontalStrut, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.EAST);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 0, 0));
		panel_6.add(panel_7, BorderLayout.NORTH);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 0, 0));
		panel_7.add(panel_8, BorderLayout.SOUTH);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(286, 35));
		panel_8.add(rigidArea_7, BorderLayout.EAST);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(39, 35));
		panel_8.add(rigidArea_6, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(308);
		panel_7.add(horizontalStrut_1, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Thông tin tìm kiếm: ");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(textField);
		textField.setColumns(15);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_1.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Th\u00F4ng tin nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Mã nhân viên: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(225, 122, 200, 41);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tên nhân viên: ");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(704, 122, 200, 41);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Ngày sinh:");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_2.setBounds(225, 209, 200, 41);
		panel_4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Phái: ");
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_3.setBounds(704, 209, 134, 41);
		panel_4.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Số điện thoại: ");
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_4.setBounds(225, 300, 200, 41);
		panel_4.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Email:");
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2_5.setBounds(704, 300, 200, 41);
		panel_4.add(lblNewLabel_2_5);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_1.setBounds(365, 122, 210, 33);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(365, 209, 210, 33);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(365, 300, 210, 33);
		panel_4.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(857, 300, 210, 33);
		panel_4.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(857, 122, 210, 33);
		panel_4.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Nam");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		rdbtnNewRadioButton.setBounds(857, 221, 85, 23);
		panel_4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnN = new JRadioButton("Nữ");
		buttonGroup.add(rdbtnN);
		rdbtnN.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		rdbtnN.setBounds(966, 221, 85, 23);
		panel_4.add(rdbtnN);
		
		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.setBounds(593, 209, 73, 33);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Sửa");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_2.setBounds(593, 300, 73, 33);
		panel_4.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Sửa");
		btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_3.setBounds(1088, 300, 73, 33);
		panel_4.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Sửa");
		btnNewButton_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_4.setBounds(1088, 213, 73, 33);
		panel_4.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Sửa");
		btnNewButton_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_5.setBounds(1088, 122, 73, 33);
		panel_4.add(btnNewButton_1_5);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(1908, 75));
		panel_3.add(rigidArea_2, BorderLayout.NORTH);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(1908, 172));
		panel_3.add(rigidArea_3, BorderLayout.SOUTH);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(8, 473));
		panel_3.add(rigidArea_4, BorderLayout.WEST);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(65, 473));
		panel_3.add(rigidArea_5, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Ch\u1EE9c n\u0103ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_5, BorderLayout.SOUTH);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_5.add(btnThem);
		
		JButton btnXoaTrang = new JButton("Xoá trắng");
		btnXoaTrang.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_5.add(btnXoaTrang);
		
		JButton btnXoa = new JButton("Xoá");
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_5.add(btnXoa);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_10, BorderLayout.WEST);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{300, 0};
		gbl_panel_10.rowHeights = new int[]{60, 60, 60, 60, 60, 60, 60, 130, 60, 0, 60, 0};
		gbl_panel_10.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
		JButton btnNewButton_1 = new JButton("Bán vé");
		btnNewButton_1.setBounds(new Rectangle(0, 0, 0, 10));
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setMinimumSize(new Dimension(65, 5));
		btnNewButton_1.setMaximumSize(new Dimension(300, 5));
		btnNewButton_1.setSize(new Dimension(300, 11));
		btnNewButton_1.setPreferredSize(new Dimension(300, 5));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		panel_10.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quản lý phim");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 1;
		panel_10.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Quản lý rạp ");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel_10.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Quản lý dịch vụ");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 3;
		panel_10.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Quản lý khách hàng");
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_4_1 = new GridBagConstraints();
		gbc_btnNewButton_4_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4_1.gridx = 0;
		gbc_btnNewButton_4_1.gridy = 4;
		panel_10.add(btnNewButton_4_1, gbc_btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Quản lý nhân viên");
		btnNewButton_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_4_2 = new GridBagConstraints();
		gbc_btnNewButton_4_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4_2.gridx = 0;
		gbc_btnNewButton_4_2.gridy = 5;
		panel_10.add(btnNewButton_4_2, gbc_btnNewButton_4_2);
		
		JButton btnNewButton_4_2_1 = new JButton("Thống kê");
		btnNewButton_4_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_4_2_1 = new GridBagConstraints();
		gbc_btnNewButton_4_2_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4_2_1.gridx = 0;
		gbc_btnNewButton_4_2_1.gridy = 6;
		panel_10.add(btnNewButton_4_2_1, gbc_btnNewButton_4_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 7;
		panel_10.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Nhân viên: Nguyễn Duy Tiến");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3_1.gridx = 0;
		gbc_lblNewLabel_3_1.gridy = 8;
		panel_10.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		lblThoiGian = new JLabel("Thời gian: ");
		lblThoiGian.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_lblThoiGian = new GridBagConstraints();
		gbc_lblThoiGian.insets = new Insets(0, 0, 5, 0);
		gbc_lblThoiGian.gridx = 0;
		gbc_lblThoiGian.gridy = 9;
		panel_10.add(lblThoiGian, gbc_lblThoiGian);
		
		JButton btnNewButton_4_2_3 = new JButton("Thoát");
		btnNewButton_4_2_3.setBackground(new Color(255, 0, 0));
		btnNewButton_4_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		GridBagConstraints gbc_btnNewButton_4_2_3 = new GridBagConstraints();
		gbc_btnNewButton_4_2_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4_2_3.gridx = 0;
		gbc_btnNewButton_4_2_3.gridy = 10;
		panel_10.add(btnNewButton_4_2_3, gbc_btnNewButton_4_2_3);
		updateTime();
	}
	private String updateTime() {
		// Lấy thời gian hiện tại
		Date currentTimeDate = new Date();

		// Định dạng thời gian
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String formattedTime = dateFormat.format(currentTimeDate);
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
