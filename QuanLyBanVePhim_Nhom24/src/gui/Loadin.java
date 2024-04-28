package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loadin extends JFrame {
    private JLabel imageLabel;
    private JProgressBar progressBar;

    public Loadin() {
        setTitle("Loading Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình

        // Tạo hình ảnh
        ImageIcon imageIcon = new ImageIcon("loading_image.png"); // Thay đổi thành đường dẫn hình ảnh của bạn
        imageLabel = new JLabel(imageIcon);

        // Tạo thanh loading
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        // Đặt hình ảnh ở trên và thanh loading ở dưới
        setLayout(new BorderLayout());
        add(imageLabel, BorderLayout.CENTER);
        add(progressBar, BorderLayout.SOUTH);

        // Mô phỏng tiến trình tải
        simulateLoading();

        setVisible(true);
    }

    private void simulateLoading() {
        // Mô phỏng tiến trình tải
        int progress = 0;
        while (progress <= 100) {
            try {
                Thread.sleep(50); // Mô phỏng thời gian tải
                progressBar.setValue(progress);
                progress++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        dispose(); // Đóng cửa sổ loading sau khi tải hoàn thành
        // Thêm mã để mở trang tiếp theo ở đây
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Loadin());
    }
}
