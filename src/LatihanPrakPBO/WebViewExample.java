package LatihanPrakPBO;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class WebViewExample extends JFrame {
    private JEditorPane editorPane;

    public WebViewExample() {
        setTitle("Web View Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        editorPane = new JEditorPane();
        editorPane.setEditable(false);
        editorPane.setContentType("text/html");

        JScrollPane scrollPane = new JScrollPane(editorPane);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Load a webpage
        loadURL("https://youtube.com");

        setVisible(true);
    }

    private void loadURL(String urlString) {
        try {
            editorPane.setPage(new URL(urlString));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new WebViewExample();
        });
    }
}
