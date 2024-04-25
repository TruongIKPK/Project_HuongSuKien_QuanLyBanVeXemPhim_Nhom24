package project_nhom;
import javax.swing.*;
import java.awt.*;

public class GiaoDienLoading extends JFrame {
    private JProgressBar progressBar;
    private JLabel loadingLabel;

    public GiaoDienLoading() {
        super("Full Screen Loading Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();


        setSize(screenWidth, screenHeight);
        setLocationRelativeTo(null); 


        JPanel panel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10); 


        loadingLabel = new JLabel("Loading...", JLabel.CENTER);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        panel.add(loadingLabel, constraints);

        progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(screenWidth - 100, 20));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(progressBar, constraints);

        setContentPane(panel);

 
        simulateLoading();
    }


    private void simulateLoading() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(50);
                        progressBar.setValue(i); 
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                   
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            loadingLabel.setText("Loading complete");
                        }
                    });
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	GiaoDienLoading fullScreenLoadingInterface = new GiaoDienLoading();
                fullScreenLoadingInterface.setVisible(true);
            }
        });
    }
}
