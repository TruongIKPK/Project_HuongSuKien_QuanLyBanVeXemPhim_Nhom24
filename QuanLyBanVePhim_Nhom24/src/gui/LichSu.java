package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;

public class LichSu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LichSu frame = new LichSu();
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
	public LichSu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1709, 713);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		verticalBox.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box horizontalBox = Box.createHorizontalBox();
		panel.add(horizontalBox);
		
		JButton btnNewButton = new JButton("Quay lại");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(3, 89, 157));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		horizontalBox.add(btnNewButton);
		
		Component rigidArea = Box.createRigidArea(new Dimension(1200, 20));
		horizontalBox.add(rigidArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Theo ngày", "Theo phim", "Theo tổng tiền"}));
		horizontalBox.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		verticalBox.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		// Tạo một đối tượng JTable với dữ liệu mẫu
        String[][] data = {{"1", "20/04/2024", "22:40", "The Matrix", "P2", "F9", "100000", "Đã đặt"}};
        String[] columnNames = {"Mã", "Ngày", "Thời gian", "Phim", "Phòng", "Ghế", "Tổng tiền", "Trạng thái"};
        JTable table = new JTable(data, columnNames);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"1", "20/04/2024", "22:40", "The Matrix", "P2", "F9", "100000", "\u0110\u00E3 \u0111\u1EB7t"},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"M\u00E3", "Ng\u00E0y", "Th\u1EDDi gian", "Phim", "Ph\u00F2ng", "Gh\u1EBF", "T\u1ED5ng ti\u1EC1n", "Tr\u1EA1ng th\u00E1i"
        	}
        ));
        
        table.setFont(new Font("Tahoma", Font.PLAIN, 25));
		// Đặt chiều cao mới cho từng hàng trong bảng
		table.setRowHeight(35);
		// Tăng kích thước của tiêu đề cột
		JTableHeader header = table.getTableHeader();
		Font headerFont = header.getFont();
		header.setFont(new Font(headerFont.getName(), Font.BOLD, 25));

        // Thêm table vào JScrollPane
        scrollPane.setViewportView(table);
	}

}
