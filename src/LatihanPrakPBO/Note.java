package LatihanPrakPBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Note extends JFrame {
    private JTextArea textArea;
    private JButton saveButton;
    private JButton clearButton;

    public Note() {
        setTitle("Simple Note App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        saveButton = new JButton("Save");
        clearButton = new JButton("Clear");

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveNote();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearNote();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(textArea, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    private void saveNote() {
        String note = textArea.getText();
        // Di sini Anda bisa menulis logika untuk menyimpan catatan ke file atau database
        JOptionPane.showMessageDialog(this, "Catatan disimpan!");
    }

    private void clearNote() {
        textArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Note app = new Note();
                app.setVisible(true);
            }
        });
    }
}