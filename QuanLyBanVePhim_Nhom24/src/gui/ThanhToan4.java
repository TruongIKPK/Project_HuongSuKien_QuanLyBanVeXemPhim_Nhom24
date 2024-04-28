package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DropMode;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class ThanhToan4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThanhToan4 frame = new ThanhToan4();
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
	public ThanhToan4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1709, 713);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

//		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		GraphicsDevice device =env.getDefaultScreenDevice();
//		this.setUndecorated(true);
//		device.setFullScreenWindow(getOwner());
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_32 = Box.createRigidArea(new Dimension(20, 20));
		contentPane.add(rigidArea_32, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.EAST);
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JPanel panel_1 = new JPanel();
		verticalBox.add(panel_1);
		
		Box verticalBox_1 = Box.createVerticalBox();
		panel_1.add(verticalBox_1);
		
		JPanel panel_3 = new JPanel();
		verticalBox_1.add(panel_3);
		
		Box horizontalBox = Box.createHorizontalBox();
		panel_3.add(horizontalBox);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2024-04-19 164659.png");
    	Image img = icon.getImage().getScaledInstance(150, 250, Image.SCALE_DEFAULT); 
    	ImageIcon newIcon = new ImageIcon(img);
    	lblNewLabel.setIcon(newIcon);
		horizontalBox.add(lblNewLabel);

		

		
		Component rigidArea_36 = Box.createRigidArea(new Dimension(70, 20));
		horizontalBox.add(rigidArea_36);
		
		
		Box verticalBox_2 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("QUỶ CÁI");
		lblNewLabel_1.setForeground(new Color(3, 89, 157));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		verticalBox_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2D phụ đề");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_2.add(lblNewLabel_2);
		
		Component rigidArea_39 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_39);
		
		JPanel panel_4 = new JPanel();
		verticalBox_1.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		
		Box verticalBox_3 = Box.createVerticalBox();
		panel_5.add(verticalBox_3);
		
		JLabel lblNewLabel_3 = new JLabel("Thể loại");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_3.add(lblNewLabel_3);
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_3.add(rigidArea_10);
		
		JLabel lblNewLabel_4 = new JLabel("Thời lượng");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_3.add(lblNewLabel_4);
		
		Component rigidArea_35 = Box.createRigidArea(new Dimension(60, 20));
		panel_5.add(rigidArea_35);
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		
		Box verticalBox_4 = Box.createVerticalBox();
		panel_6.add(verticalBox_4);
		
		JLabel lblNewLabel_5 = new JLabel("Kinh dị");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_4.add(lblNewLabel_5);
		
		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_4.add(rigidArea_11);
		
		JLabel lblNewLabel_6 = new JLabel("90 phút");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_4.add(lblNewLabel_6);
		
		Component rigidArea_34 = Box.createRigidArea(new Dimension(90, 20));
		panel_6.add(rigidArea_34);
		
		JSeparator separator = new JSeparator();
		verticalBox.add(separator);
		
		JPanel panel_2 = new JPanel();
		verticalBox.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		
		Box verticalBox_5 = Box.createVerticalBox();
		panel_11.add(verticalBox_5);
		
		JLabel lblNewLabel_10 = new JLabel("Rạp chiếu");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_5.add(lblNewLabel_10);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_5.add(rigidArea);
		
		JLabel lblNewLabel_11 = new JLabel("Ngày chiếu");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_5.add(lblNewLabel_11);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_5.add(rigidArea_1);
		
		JLabel lblNewLabel_12 = new JLabel("Giờ chiếu");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_5.add(lblNewLabel_12);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_5.add(rigidArea_2);
		
		JLabel lblNewLabel_13 = new JLabel("Phòng chiếu");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_5.add(lblNewLabel_13);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_5.add(rigidArea_3);
		
		JLabel lblNewLabel_14 = new JLabel("Ghế ngồi");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_5.add(lblNewLabel_14);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_5.add(rigidArea_4);
		
		JButton btnNewButton = new JButton("QUAY LẠI");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(3, 89, 157));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		verticalBox_5.add(btnNewButton);
		
		JPanel panel_12 = new JPanel();
		panel_2.add(panel_12);
		
		Box verticalBox_6 = Box.createVerticalBox();
		panel_12.add(verticalBox_6);
		
		JLabel lblNewLabel_15 = new JLabel("Beta Quang Trung");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(lblNewLabel_15);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_6.add(rigidArea_5);
		
		JLabel lblNewLabel_16 = new JLabel("15/04/2024");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(lblNewLabel_16);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_6.add(rigidArea_6);
		
		JLabel lblNewLabel_17 = new JLabel("22:40");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(lblNewLabel_17);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_6.add(rigidArea_7);
		
		JLabel lblNewLabel_18 = new JLabel("P2");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(lblNewLabel_18);
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_6.add(rigidArea_8);
		
		JLabel lblNewLabel_19 = new JLabel("G7, G6");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_6.add(lblNewLabel_19);
		
		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_6.add(rigidArea_9);
		
		JButton btnNewButton_1 = new JButton("THANH TOÁN");
		btnNewButton_1.setBackground(new Color(3, 89, 157));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		verticalBox_6.add(btnNewButton_1);
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		panel_7.add(horizontalBox_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		horizontalBox_1.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox_7 = Box.createVerticalBox();
		panel_8.add(verticalBox_7);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Beta Voucher");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_10.add(lblNewLabel_7);
		
		JSeparator separator_1 = new JSeparator();
		verticalBox_7.add(separator_1);
		
		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_19);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		panel_13.add(horizontalBox_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_8 = new JLabel("Nhập mã voucher");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_2.add(lblNewLabel_8);
		
		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_12);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_2.add(textField);
		textField.setColumns(12);
		
		Insets insets = textField.getInsets();
        insets.top = 5; 
        insets.bottom = 5;
        textField.setMargin(insets);
		
		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_20);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		panel_14.add(horizontalBox_3);
		
		JLabel lblNewLabel_9 = new JLabel("Voucher");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_3.add(lblNewLabel_9);
		
		Component rigidArea_13 = Box.createRigidArea(new Dimension(122, 20));
		horizontalBox_3.add(rigidArea_13);
		
		String[] vouchers = new String[] {"", "Giảm 7000 vnđ", "Giảm 10000 vnđ", "Giảm 12000 vnđ"};
		JComboBox comboBox = new JComboBox(vouchers);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setBackground(Color.WHITE);
		horizontalBox_3.add(comboBox);
		
		
		
		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_21);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("ÁP MÃ");
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_16.add(btnNewButton_2);
		
		Component rigidArea_28 = Box.createRigidArea(new Dimension(210, 20));
		panel_16.add(rigidArea_28, BorderLayout.WEST);
		
		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 40));
		verticalBox_7.add(rigidArea_22);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_20 = new JLabel("Điểm beta");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_17.add(lblNewLabel_20, BorderLayout.NORTH);
		
		JSeparator separator_2 = new JSeparator();
		panel_17.add(separator_2, BorderLayout.SOUTH);
		
		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_23);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		panel_18.add(horizontalBox_4, BorderLayout.NORTH);
		
		JLabel lblNewLabel_21 = new JLabel("Số điện thoại");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_4.add(lblNewLabel_21);
		
		Component rigidArea_14 = Box.createRigidArea(new Dimension(65, 20));
		horizontalBox_4.add(rigidArea_14);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_4.add(textField_1);
		textField_1.setColumns(10);
		
		Insets insets1 = textField_1.getInsets();
        insets1.top = 5; 
        insets1.bottom = 5;
        textField_1.setMargin(insets1);
		
		Component rigidArea_24 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_24);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		horizontalBox_5.setBackground(new Color(255, 255, 255));
		panel_19.add(horizontalBox_5, BorderLayout.NORTH);
		
		JLabel lblNewLabel_22 = new JLabel("Điểm hiện có");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_5.add(lblNewLabel_22);
		
		Component rigidArea_15 = Box.createRigidArea(new Dimension(65, 20));
		horizontalBox_5.add(rigidArea_15);
		
		JLabel lblNewLabel_23 = new JLabel("17600");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_5.add(lblNewLabel_23);
		
		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_18);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		panel_20.add(horizontalBox_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_24 = new JLabel("Nhập điểm");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_6.add(lblNewLabel_24);
		
		Component rigidArea_16 = Box.createRigidArea(new Dimension(90, 20));
		horizontalBox_6.add(rigidArea_16);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_6.add(textField_2);
		textField_2.setColumns(10);
		
		Insets insets2 = textField_2.getInsets();
        insets2.top = 5; 
        insets2.bottom = 5;
        textField_2.setMargin(insets2);
		
		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_25);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_21);
		panel_21.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		panel_21.add(horizontalBox_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_25 = new JLabel("Số tiền được giảm");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_7.add(lblNewLabel_25);
		
		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_17);
		
		JLabel lblNewLabel_26 = new JLabel("= 0 VNĐ");
		lblNewLabel_26.setBackground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_7.add(lblNewLabel_26);
		
		Component rigidArea_26 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_7.add(rigidArea_26);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 255));
		verticalBox_7.add(panel_22);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("ĐỔI ĐIỂM");
		btnNewButton_3.setBackground(new Color(255, 69, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_22.add(btnNewButton_3);
		
		Component rigidArea_27 = Box.createRigidArea(new Dimension(210, 20));
		panel_22.add(rigidArea_27, BorderLayout.WEST);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		horizontalBox_1.add(panel_15);
		
		Component rigidArea_30 = Box.createRigidArea(new Dimension(10, 20));
		panel_15.add(rigidArea_30);
       
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		horizontalBox_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_8 = Box.createVerticalBox();
		panel_9.add(verticalBox_8, BorderLayout.NORTH);
		
		Component rigidArea_31 = Box.createRigidArea(new Dimension(20, 5));
		verticalBox_8.add(rigidArea_31);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		verticalBox_8.add(panel_23);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("Chọn phương thức thanh toán");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_23.add(lblNewLabel_27, BorderLayout.NORTH);
		
		JSeparator separator_3 = new JSeparator();
		panel_23.add(separator_3, BorderLayout.SOUTH);
		
		Component rigidArea_29 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_8.add(rigidArea_29);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_8.add(tabbedPane);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Trực tiếp", null, panel_24, null);
		panel_24.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_9 = Box.createVerticalBox();
		panel_24.add(verticalBox_9);
		
		Component rigidArea_33 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_33);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_28 = new JLabel("Thanh toán trực tiếp");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_26.add(lblNewLabel_28);
		
		Component rigidArea_42 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_42);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		panel_27.add(horizontalBox_8, BorderLayout.NORTH);
		
		JLabel lblNewLabel_29 = new JLabel("Tổng tiền");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_8.add(lblNewLabel_29);
		
		Component rigidArea_37 = Box.createRigidArea(new Dimension(305, 20));
		horizontalBox_8.add(rigidArea_37);
		
		JLabel lblNewLabel_30 = new JLabel("100.000 VNĐ");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_8.add(lblNewLabel_30);
		
		Component rigidArea_41 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_41);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_28);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		panel_28.add(horizontalBox_9, BorderLayout.NORTH);
		
		JLabel lblNewLabel_31 = new JLabel("Số tiền được giảm");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_9.add(lblNewLabel_31);
		
		Component rigidArea_38 = Box.createRigidArea(new Dimension(210, 20));
		horizontalBox_9.add(rigidArea_38);
		
		JLabel lblNewLabel_32 = new JLabel("0 VNĐ");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_9.add(lblNewLabel_32);
		
		Component rigidArea_43 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_43);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_10 = Box.createHorizontalBox();
		panel_29.add(horizontalBox_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_33 = new JLabel("Số tiền cần thanh toán");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_10.add(lblNewLabel_33);
		
		Component rigidArea_40 = Box.createRigidArea(new Dimension(160, 20));
		horizontalBox_10.add(rigidArea_40);
		
		JLabel lblNewLabel_34 = new JLabel("100.000 VNĐ");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_10.add(lblNewLabel_34);
		
		Component rigidArea_45 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_45);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_30);
		panel_30.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_11 = Box.createHorizontalBox();
		panel_30.add(horizontalBox_11);
		
		JLabel lblNewLabel_35 = new JLabel("Tiền nhận");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_11.add(lblNewLabel_35);
		
		Component rigidArea_44 = Box.createRigidArea(new Dimension(200, 20));
		horizontalBox_11.add(rigidArea_44);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_11.add(textField_3);
		textField_3.setColumns(10);
		
		Component rigidArea_50 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_50);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_31);
		panel_31.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_12 = Box.createHorizontalBox();
		panel_31.add(horizontalBox_12, BorderLayout.NORTH);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(255, 255, 255));
		horizontalBox_12.add(panel_33);
		panel_33.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_10 = Box.createVerticalBox();
		panel_33.add(verticalBox_10, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("  1.000 (0)  ");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(3, 89, 157));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_10.add(btnNewButton_4);
		
		Component rigidArea_51 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_10.add(rigidArea_51);
		
		JButton btnNewButton_5 = new JButton(" 10.000 (0) ");
		btnNewButton_5.setBackground(new Color(3, 89, 157));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_10.add(btnNewButton_5);
		
		Component rigidArea_52 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_10.add(rigidArea_52);
		
		JButton btnNewButton_6 = new JButton("100.000 (0)");
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setBackground(new Color(3, 89, 157));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_10.add(btnNewButton_6);
		
		Component rigidArea_46 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_12.add(rigidArea_46);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(255, 255, 255));
		horizontalBox_12.add(panel_34);
		panel_34.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_11 = Box.createVerticalBox();
		panel_34.add(verticalBox_11, BorderLayout.NORTH);
		
		JButton btnNewButton_7 = new JButton("  2.000 (0)  ");
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setBackground(new Color(3, 89, 157));
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_11.add(btnNewButton_7);
		
		Component rigidArea_53 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_11.add(rigidArea_53);
		
		JButton btnNewButton_8 = new JButton(" 20.000 (0) ");
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setBackground(new Color(3, 89, 157));
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_11.add(btnNewButton_8);
		
		Component rigidArea_54 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_11.add(rigidArea_54);
		
		JButton btnNewButton_9 = new JButton("200.000 (0)");
		btnNewButton_9.setForeground(new Color(255, 255, 255));
		btnNewButton_9.setBackground(new Color(3, 89, 157));
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_11.add(btnNewButton_9);
		
		Component rigidArea_47 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_12.add(rigidArea_47);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(255, 255, 255));
		horizontalBox_12.add(panel_35);
		panel_35.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox_12 = Box.createVerticalBox();
		panel_35.add(verticalBox_12, BorderLayout.NORTH);
		
		JButton btnNewButton_10 = new JButton("  5.000 (0)  ");
		btnNewButton_10.setForeground(new Color(255, 255, 255));
		btnNewButton_10.setBackground(new Color(3, 89, 157));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_12.add(btnNewButton_10);
		
		Component rigidArea_55 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_12.add(rigidArea_55);
		
		JButton btnNewButton_11 = new JButton(" 50.000 (0) ");
		btnNewButton_11.setForeground(new Color(255, 255, 255));
		btnNewButton_11.setBackground(new Color(3, 89, 157));
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_12.add(btnNewButton_11);
		
		Component rigidArea_56 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_12.add(rigidArea_56);
		
		JButton btnNewButton_12 = new JButton("500.000 (0)");
		btnNewButton_12.setForeground(new Color(255, 255, 255));
		btnNewButton_12.setBackground(new Color(3, 89, 157));
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalBox_12.add(btnNewButton_12);
		
		Component rigidArea_49 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_9.add(rigidArea_49);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(255, 255, 255));
		verticalBox_9.add(panel_32);
		panel_32.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox_13 = Box.createHorizontalBox();
		panel_32.add(horizontalBox_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_36 = new JLabel("Tiền trả lại");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_13.add(lblNewLabel_36);
		
		Component rigidArea_48 = Box.createRigidArea(new Dimension(290, 20));
		horizontalBox_13.add(rigidArea_48);
		
		JLabel lblNewLabel_37 = new JLabel("0 VNĐ");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, 25));
		horizontalBox_13.add(lblNewLabel_37);
		
		JPanel panel_25 = new JPanel();
		tabbedPane.addTab("Online", null, panel_25, null);
		
		
	}
}
