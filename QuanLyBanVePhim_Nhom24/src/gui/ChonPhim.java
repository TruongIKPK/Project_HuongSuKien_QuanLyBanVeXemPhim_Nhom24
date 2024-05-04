package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Insets;

public class ChonPhim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private static LocalDate currentDate = LocalDate.now();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChonPhim frame = new ChonPhim();
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
	public ChonPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1079, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Danh Sách Phim Đang Chiếu");
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
		panel_4.add(btnNewButton_13, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.EAST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		panel_5.add(rigidArea_1, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6, BorderLayout.SOUTH);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_6.add(panel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Mã hoặc tên phim: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_10.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(20);
		panel_10.add(textField);
		
		JButton btnNewButton_1 = new JButton("Tìm");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_10.add(btnNewButton_1);
		
		JPanel panel_11 = new JPanel();
		panel_6.add(panel_11, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		
		JButton btnNewButton_10 = new JButton("<<");
		btnNewButton_10.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                currentDate = currentDate.minusDays(5);
                updateDateButtons(panel_12);
            }
		});
		panel_11.add(btnNewButton_10);
		
		panel_12.setBackground(Color.LIGHT_GRAY);
		panel_11.add(panel_12);
		
		JButton btnNewButton_12 = new JButton(currentDate.plusDays(0).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton(currentDate.plusDays(1).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(currentDate.plusDays(2).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton(currentDate.plusDays(3).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton(currentDate.plusDays(4).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton(currentDate.plusDays(5).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton(currentDate.plusDays(6).format(DateTimeFormatter.ofPattern("dd/MM")));
		panel_12.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton(">>");
		btnNewButton_20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentDate = currentDate.plusDays(7);
                updateDateButtons(panel_12);
            }
		});
		panel_11.add(btnNewButton_20);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(158, 575));
		panel_1.add(rigidArea_2, BorderLayout.WEST);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(151, 575));
		panel_1.add(rigidArea_3, BorderLayout.EAST);
		ImageIcon icon = new ImageIcon(ChonGhe.class.getResource("/gui/test (1).png"));
    	Image img = icon.getImage().getScaledInstance(100, 150, Image.SCALE_DEFAULT); 
    	ImageIcon newIcon = new ImageIcon(img);
		
		JSeparator separator = new JSeparator();
		panel_1.add(separator, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		Box verticalBox = Box.createVerticalBox();
		
		JPanel panel_7 = new JPanel();
		verticalBox.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));
		ImageIcon icon1 = new ImageIcon(ChonPhim.class.getResource("/images/ThanhToan.png"));
    	Image img1 = icon1.getImage().getScaledInstance(100, 175, Image.SCALE_DEFAULT); 
    	ImageIcon newIcon1 = new ImageIcon(img1);
    	lblNewLabel_2.setIcon(newIcon1);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_7.add(lblNewLabel_2, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox = Box.createHorizontalBox();
		panel_9.add(horizontalBox, BorderLayout.NORTH);
		
		JLabel lblNewLabel_4 = new JLabel("Điềm Báo Của Quỷ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phụ Đề 2D");
		horizontalBox.add(lblNewLabel_5);
		
		JPanel panel_13 = new JPanel();
		panel_9.add(panel_13, BorderLayout.CENTER);
		GridBagLayout gbl_panel_13 = new GridBagLayout();
		gbl_panel_13.columnWidths = new int[]{85, 85, 85, 85, 85, 85, 85, 0};
		gbl_panel_13.rowHeights = new int[]{76, 76, 0};
		gbl_panel_13.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_13.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_13.setLayout(gbl_panel_13);
		
		JButton btnNewButton = new JButton("9:00");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChonGhe chonghe = new ChonGhe();
                chonghe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chonghe.setExtendedState(MAXIMIZED_BOTH);
                chonghe.setVisible(true);
                setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel_13.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("10:00");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChonGhe chonghe = new ChonGhe();
                chonghe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chonghe.setExtendedState(MAXIMIZED_BOTH);
                chonghe.setVisible(true);
                setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 0;
		panel_13.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("12:30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChonGhe chonghe = new ChonGhe();
                chonghe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chonghe.setExtendedState(MAXIMIZED_BOTH);
                chonghe.setVisible(true);
                setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 0;
		panel_13.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("15:00");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChonGhe chonghe = new ChonGhe();
                chonghe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chonghe.setExtendedState(MAXIMIZED_BOTH);
                chonghe.setVisible(true);
                setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 0;
		panel_13.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("23:00");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChonGhe chonghe = new ChonGhe();
                chonghe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                chonghe.setExtendedState(MAXIMIZED_BOTH);
                chonghe.setVisible(true);
                setVisible(false);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 4;
		gbc_btnNewButton_4.gridy = 0;
		panel_13.add(btnNewButton_4, gbc_btnNewButton_4);
		panel_3.add(verticalBox);
		
		JPanel panel_7_1 = new JPanel();
		verticalBox.add(panel_7_1);
		panel_7_1.setLayout(new BorderLayout(0, 0));
	}
	private static void updateDateButtons(JPanel panel) {
        panel.removeAll();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        for (int i = 0; i < 7; i++) {
            JButton button = new JButton(formatter.format(currentDate.plusDays(i)));
            panel.add(button);
        }

        panel.revalidate();
        panel.repaint();
    }
}
