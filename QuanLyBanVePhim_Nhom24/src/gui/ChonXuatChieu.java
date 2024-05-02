package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class ChonXuatChieu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String url;
	private String username;
	private String password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChonXuatChieu frame = new ChonXuatChieu();
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
	public ChonXuatChieu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1223, 747);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Phầm mềm bán vé xem phim");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_1.add(lblNewLabel);
		
		Component rigidArea = Box.createRigidArea(new Dimension(1197, 66));
		panel_1.add(rigidArea, BorderLayout.NORTH);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(1197, 49));
		panel_1.add(rigidArea_1, BorderLayout.SOUTH);
		
		JPanel pnlTimKiem = new JPanel();
		pnlTimKiem.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(pnlTimKiem, BorderLayout.CENTER);
		pnlTimKiem.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlTimKiem.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Tên phim: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pnlTimKiem.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pnlTimKiem.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Tìm");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pnlTimKiem.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lấy vé");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pnlTimKiem.add(btnNewButton_2);
		
		JPanel pnlPhim = new JPanel();
		pnlPhim.setLayout(new GridLayout(0,1));
		contentPane.add(pnlPhim, BorderLayout.CENTER);
		
		


        // Kết nối đến cơ sở dữ liệu SQL Server
       url = "jdbc:sqlserver://localhost:1433;databaseName=PhimTest";
       username = "sa";
       password = "sapassword";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM Phim";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Hiển thị thông tin các phim
            while (resultSet.next()) {
                String movieName = resultSet.getString("TenPhim");
                String movieInfo = resultSet.getString("ThongTinPhim");

                // Tạo một JPanel cho mỗi phim
                JPanel moviePanel = createMoviePanel(movieName, movieInfo);
                pnlPhim.add(moviePanel, BorderLayout.CENTER);	
//        		contentPane.setLayout(new GridLayout(0, 1)); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
		
		
	}

	 private JPanel createMoviePanel(String movieName, String movieInfo) {
	        JPanel pnlTao = new JPanel(new BorderLayout());
	        JLabel image = new JLabel(new ImageIcon(ChonXuatChieuTest.class.getResource("/gui/phim.png")));
	        JLabel nameLabel = new JLabel("Tên phim: " + movieName);
//	        pnlTao.setLayout(new GridLayout(0,1));
	        nameLabel.setFont(new Font("TimeNewRoman", ABORT, 20));
	        pnlTao.setBorder(new EmptyBorder(10, 10, 10, 10));
	        pnlTao.add(image,BorderLayout.WEST);
	        pnlTao.add(nameLabel,BorderLayout.NORTH);

	        JTextArea infoArea = new JTextArea("Thông tin phim:\n" + movieInfo);
	        infoArea.setFont(new Font("TimeNewRoman", ABORT, 20));
	        infoArea.setEditable(false);
	        pnlTao.add(infoArea, BorderLayout.SOUTH);

	        // TJPanel chứa các xuất chiếu
	        JPanel showTimePanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Sắp xếp các nút theo hàng ngang
	        try (Connection connection = DriverManager.getConnection(url, username, password)) {
	            String query = "select gioChieu from xuatchieu a join phim b on a.maPhim = b.maPhim\r\n"
	            		+ "where b.tenPhim = ?\r\n"
	            		+ "";
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, movieName);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            // Thêm các nút xuất chiếu cho phim hiện tại
	            while (resultSet.next()) {
	                String showTime = resultSet.getString("gioChieu");
	                JButton button = new JButton(showTime);
	                button.setPreferredSize(new Dimension(250,40));
	                button.setFont(new Font("TimeNewRoman", ABORT, 20));
	                button.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        String selectedShowTime = ((JButton) e.getSource()).getText();
	                        JOptionPane.showMessageDialog(null, "Bạn đã chọn xuất chiếu " + selectedShowTime + " của phim " + movieName);
	                        // Chuyển sang trang chọn ghế
	                    }
	                });
	                showTimePanel.add(button);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        pnlTao.add(showTimePanel, BorderLayout.CENTER);

	        return pnlTao;
	    }
}
