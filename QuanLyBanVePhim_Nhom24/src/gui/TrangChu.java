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
		contentPane.setLayout(null);
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1973, 164);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ RẠP CHIẾU PHIM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(760, 54, 416, 72);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("BÁN VÉ");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Iconsmind-Outline-Movie-Ticket.128.png"));
		btnNewButton.setBounds(480, 284, 277, 221);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("RẠP");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Iconsmind-Outline-Cinema.128.png"));
		btnNewButton_2.setBounds(775, 576, 277, 221);
		contentPane.add(btnNewButton_2);
		
		JButton btnNhnVin = new JButton("NHÂN VIÊN");
		btnNhnVin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNhnVin.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Hopstarter-Soft-Scraps-User-Administrator-Blue.128.png"));
		btnNhnVin.setBounds(775, 284, 277, 221);
		contentPane.add(btnNhnVin);
		
		JButton btnPhim = new JButton("PHIM");
		btnPhim.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPhim.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Iconoir-Team-Iconoir-Cinema-old.128.png"));
		btnPhim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPhim.setBounds(1070, 576, 277, 221);
		contentPane.add(btnPhim);
		
		JButton btnKhchHng = new JButton("KHÁCH HÀNG");
		btnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnKhchHng.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Custom-Icon-Design-Silky-Line-User-Men.128.png"));
		btnKhchHng.setBounds(1070, 285, 277, 221);
		contentPane.add(btnKhchHng);
		
		JButton btnNewButton_3 = new JButton("ĐĂNG XUẤT");
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Icons8-Windows-8-User-Interface-Logout.64.png"));
		btnNewButton_3.setBounds(1404, 722, 238, 73);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nhân viên: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(1431, 623, 183, 47);
		contentPane.add(lblNewLabel_1);
		
		lblThoiGian = new JLabel("");
		lblThoiGian.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblThoiGian.setBounds(1431, 675, 183, 47);
		contentPane.add(lblThoiGian);
		
		JButton btnNewButton_1 = new JButton("DỊCH VỤ");
		btnNewButton_1.setBounds(480, 574, 277, 221);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Duy Tien\\Downloads\\IMAGES\\Iconarchive-Fat-Sugar-Food-Popcorn.128.png"));
		updateTime();
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
