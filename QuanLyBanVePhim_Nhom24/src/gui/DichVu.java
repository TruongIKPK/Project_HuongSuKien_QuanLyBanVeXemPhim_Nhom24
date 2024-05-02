package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DichVu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField[] textfield;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DichVu frame = new DichVu();
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
	public DichVu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Dịch Vụ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_2.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel_4.add(rigidArea, BorderLayout.WEST);
		
		JButton btnNewButton_13 = new JButton("   Trở Lại   ");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrangChu trangchu;
				try {
					trangchu = new TrangChu();
					trangchu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					trangchu.setExtendedState(MAXIMIZED_BOTH);
					trangchu.setVisible(true);
	                setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setBorder(new EmptyBorder(10, 20, 10, 20));
		btnNewButton_13.setBackground(Color.LIGHT_GRAY);
		panel_4.add(btnNewButton_13, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.EAST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_1, BorderLayout.EAST);
		
		JButton btnNewButton_13_1 = new JButton("Tiêp Tục");
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanhToan thanhtoan = new ThanhToan();
				thanhtoan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				thanhtoan.setExtendedState(MAXIMIZED_BOTH);
				thanhtoan.setVisible(true);
                setVisible(false);
			}
		});
		btnNewButton_13_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13_1.setBorder(new EmptyBorder(10, 20, 10, 20));
		btnNewButton_13_1.setBackground(Color.LIGHT_GRAY);
		panel_5.add(btnNewButton_13_1, BorderLayout.WEST);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Mã hoặc tên dịch vụ: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_6.add(textField_1);
		textField_1.setColumns(20);
		
		JButton btnNewButton_1 = new JButton("Tìm");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(new Color(255, 255, 255));
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setColumnHeaderView(panel_1);
//		scrollPane.setColumnHeaderView(panel_1);
		
		Box verticalBox = Box.createVerticalBox();
		panel_1.add(verticalBox);
		
		int dem = 0, sl = 5;
		
		Box horizontalBox = null;
		for(int i = 0; i < sl; i++) {
			JPanel panel_3_1 = new JPanel();
			dem++;
            if(dem % 3 == 1) {
                horizontalBox = Box.createHorizontalBox();
                verticalBox.add(horizontalBox); 
            }
            horizontalBox.add(panel_3_1);
			JLabel lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 5));
			lblNewLabel_1_1.setBounds(new Rectangle(2, 2, 3, 2));
			lblNewLabel_1_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
			ImageIcon icon = new ImageIcon(ChonGhe.class.getResource("/gui/test (1).png"));
	    	Image img = icon.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT); 
	    	ImageIcon newIcon = new ImageIcon(img);
	    	panel_3_1.setLayout(new BorderLayout(0, 0));
	    	lblNewLabel_1_1.setIcon(newIcon);
			panel_3_1.add(lblNewLabel_1_1, BorderLayout.WEST);
			
			Box verticalBox_1 = Box.createVerticalBox();
			verticalBox_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
			panel_3_1.add(verticalBox_1);
			
			JLabel lblNewLabel_2_1 = new JLabel("KUNGFU PANDA");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
			verticalBox_1.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_3_1 = new JLabel("- Thêm 29,000đ nhận ngay bắp ngọt lớn");
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			verticalBox_1.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_4_1 = new JLabel("- Nhận ngay trong ngày đã mua");
			lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			verticalBox_1.add(lblNewLabel_4_1);
			
			JLabel lblNewLabel_5_1 = new JLabel("Giá: 199.000,00 ₫");
			lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 23));
			verticalBox_1.add(lblNewLabel_5_1);
			
			JPanel panel_3 = new JPanel();
			verticalBox_1.add(panel_3);
			
			JButton btnNewButton = new JButton(" - ");
			btnNewButton.setBorderPainted(false);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(new Color(0, 189, 214));
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
			
			textField = new JTextField(2);
			textField.setFocusTraversalPolicyProvider(true);
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setText("1");
			textField.setFont(new Font("Tahoma", Font.BOLD, 25));
			textField.setColumns(2);
			
			JButton button = new JButton("+");
			button.setBorderPainted(false);
			button.setBackground(new Color(0, 189, 214));
			button.setForeground(Color.WHITE);
			button.setFont(new Font("Tahoma", Font.PLAIN, 25));
			panel_3.add(btnNewButton);
			panel_3.add(textField);
			panel_3.add(button);
			
			if(sl % 3 == 1 && i+1 == sl) {
				Dimension chieurong = panel_3_1.getPreferredSize();
				Component rigidArea1 = Box.createRigidArea(chieurong);
				Component rigidArea2 = Box.createRigidArea(chieurong);
				horizontalBox.add(rigidArea1);
				horizontalBox.add(rigidArea2);
			}else if(sl % 3 == 2 && i+1 == sl) {
				Dimension chieurong = panel_3_1.getPreferredSize();
				Component rigidArea1 = Box.createRigidArea(chieurong);
				horizontalBox.add(rigidArea1);
			}
		}	
	}
}
