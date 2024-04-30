package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.GridLayout;

public class GiaoDienLayVe1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDienLayVe1 frame = new GiaoDienLayVe1();
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
	public GiaoDienLayVe1() {
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(169, 844));
		getContentPane().add(rigidArea_1, BorderLayout.WEST);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(169, 685));
		getContentPane().add(rigidArea_2, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN ĐẶT VÉ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3.setBounds(-81, 821, 1212, 31);
		panel_2.add(rigidArea_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 10, 1191, 61);
		panel_2.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Nhập mã vé :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_4.add(lblNewLabel_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_4.add(textField_8);
		textField_8.setColumns(20);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		panel_4.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 73, 1159, 567);
		panel_2.add(panel_5);
		panel_5.setBackground(new Color(255, 250, 205));
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("VÉ XEM PHIM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("GẶP LẠI CHỊ BẦU");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 250, 205));
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Tên khách hàng");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(40, 0, 189, 44);
		panel_6.add(lblNewLabel_4);
		
		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_9.setBounds(188, 45, 285, 44);
		panel_6.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Phòng chiếu");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(40, 90, 189, 44);
		panel_6.add(lblNewLabel_5);
		
		textField_10 = new JTextField();
		textField_10.setBounds(188, 122, 285, 44);
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Xuất chiếu");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(581, 5, 189, 35);
		panel_6.add(lblNewLabel_6);
		
		textField_11 = new JTextField();
		textField_11.setBounds(633, 45, 350, 44);
		panel_6.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ghế");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(581, 95, 189, 35);
		panel_6.add(lblNewLabel_7);
		
		textField_12 = new JTextField();
		textField_12.setBounds(633, 119, 350, 49);
		panel_6.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Combo bắp nước:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(14, 198, 189, 35);
		panel_6.add(lblNewLabel_8);
		
		textField_13 = new JTextField();
		textField_13.setBounds(188, 196, 795, 44);
		panel_6.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Tổng tiền:");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_9.setBounds(24, 250, 163, 45);
		panel_6.add(lblNewLabel_9);
		
		textField_14 = new JTextField();
		textField_14.setBounds(188, 252, 795, 45);
		panel_6.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Vé xem phim không hoàn trả !");
		lblNewLabel_10.setBounds(0, 322, 1058, 34);
		panel_6.add(lblNewLabel_10);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.ITALIC, 20));
		
		JButton btnNewButton_1 = new JButton("IN BILL");
		btnNewButton_1.setBounds(933, 639, 241, 53);
		panel_2.add(btnNewButton_1);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
	
}
}