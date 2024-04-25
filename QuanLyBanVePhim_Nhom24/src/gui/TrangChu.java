package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class TrangChu extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JLabel lblThoiGian;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					
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
	public TrangChu() {
		setTitle("Trang Chủ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 1385, 847);
		setLocationRelativeTo(null);
		setUndecorated(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_7);
		panel_7.setLayout(new GridLayout(2,3));
		
		JButton btnBanVe = new JButton("");
		btnBanVe.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Icons8-Windows-8-Cinema-Ticket.128.png")));
		btnBanVe.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnBanVe);
		
		JButton btnNhanVien = new JButton("");
		btnNhanVien.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Hopstarter-Soft-Scraps-User-Administrator-Blue.128.png")));
		btnNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnNhanVien);
		
		JButton btnKhachHang = new JButton("");
		btnKhachHang.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Custom-Icon-Design-Silky-Line-User-Men.128.png")));
		btnKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnKhachHang);
		
		JButton btnDichVu = new JButton("");
		btnDichVu.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Iconarchive-Fat-Sugar-Food-Popcorn.128.png")));
		btnDichVu.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnDichVu);
		
		JButton btnRap = new JButton("");
		btnRap.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Iconsmind-Outline-Cinema.128.png")));
		btnRap.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnRap);
		
		JButton btnPhim = new JButton("");
		btnPhim.setIcon(new ImageIcon(TrangChu.class.getResource("/images/Iconoir-Team-Iconoir-Cinema-old.128.png")));
		btnPhim.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_7.add(btnPhim);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(1359, 131));
		panel.add(rigidArea_4, BorderLayout.NORTH);
		
		Component rigidArea_4_1 = Box.createRigidArea(new Dimension(1359, 143));
		panel.add(rigidArea_4_1, BorderLayout.SOUTH);
		
		Component rigidArea_4_2 = Box.createRigidArea(new Dimension(242, 289));
		panel.add(rigidArea_4_2, BorderLayout.WEST);
		
		Component rigidArea_4_3 = Box.createRigidArea(new Dimension(252, 289));
		rigidArea_4_3.setEnabled(false);
		panel.add(rigidArea_4_3, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("PHẦN MỀM QUẢN LÝ RẠP CHIẾU PHIM");
		lblNewLabel_2.setBackground(new Color(255, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 0, 0));
		panel_1.add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 0, 0));
		panel_3.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Nhân viên: Nguyễn Duy Tiến");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_4.add(lblNewLabel_3, BorderLayout.NORTH);
		
		lblThoiGian = new JLabel("Thời gian: ");
		lblThoiGian.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_4.add(lblThoiGian, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 0, 0));
		panel_4.add(panel_5, BorderLayout.SOUTH);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_4 = new JButton("Đăng xuất");
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_5.add(btnNewButton_4, BorderLayout.CENTER);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(38, 35));
		panel_5.add(rigidArea_2, BorderLayout.WEST);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(251, 35));
		panel_5.add(rigidArea_3, BorderLayout.EAST);
		
		Component horizontalStrut = Box.createHorizontalStrut(280);
		panel_4.add(horizontalStrut, BorderLayout.EAST);
		
		Component rigidArea = Box.createRigidArea(new Dimension(1359, 67));
		panel_1.add(rigidArea, BorderLayout.NORTH);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(1359, 71));
		panel_1.add(rigidArea_1, BorderLayout.SOUTH);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(417);
		panel_1.add(horizontalStrut_1, BorderLayout.WEST);
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
