package LatihanPrakPBO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class VideoPlayerGUI extends JFrame {
    private JButton openButton;

    public VideoPlayerGUI() {
        setTitle("Video Player");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        openButton = new JButton("Open Video");

        // Add action listener to the open button
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openVideo();
            }
        });

        // Add components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(openButton);
    }

    private void openVideo() {
        // Create a file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a video file");

        // Accept only video files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".mp4") ||
                       file.getName().toLowerCase().endsWith(".avi") ||
                       file.getName().toLowerCase().endsWith(".mov");
            }

            public String getDescription() {
                return "Video Files (*.mp4, *.avi, *.mov)";
            }
        });

        // Show the file chooser dialog
        int result = fileChooser.showOpenDialog(this);

        // If a file is selected, open it with the default media player
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                Desktop.getDesktop().open(selectedFile);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening video file: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VideoPlayerGUI gui = new VideoPlayerGUI();
                gui.setVisible(true);
            }
        });
    }
}
