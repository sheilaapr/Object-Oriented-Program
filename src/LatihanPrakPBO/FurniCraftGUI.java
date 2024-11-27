package LatihanPrakPBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FurniCraftGUI extends JFrame implements ActionListener {
    private JTextField itemNameField, quantityField;
    private JButton addButton, viewInventoryButton;
    private JTextArea inventoryArea;

    public FurniCraftGUI() {
        setTitle("FurniCraft Home Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Panel untuk input
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        JLabel itemNameLabel = new JLabel("Item Name:");
        itemNameField = new JTextField();
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityField = new JTextField();
        inputPanel.add(itemNameLabel);
        inputPanel.add(itemNameField);
        inputPanel.add(quantityLabel);
        inputPanel.add(quantityField);

        // Panel untuk tombol
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add Item");
        viewInventoryButton = new JButton("View Inventory");
        addButton.addActionListener(this);
        viewInventoryButton.addActionListener(this);
        buttonPanel.add(addButton);
        buttonPanel.add(viewInventoryButton);

        // Area untuk menampilkan inventaris
        inventoryArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(inventoryArea);

        // Menambahkan panel-panel ke panel utama
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Menambahkan panel utama ke frame
        add(mainPanel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String itemName = itemNameField.getText();
            String quantityText = quantityField.getText();
            int quantity = Integer.parseInt(quantityText);
            String itemInfo = "Item Name: " + itemName + ", Quantity: " + quantity + "\n";
            inventoryArea.append(itemInfo);
            // Kosongkan field setelah ditambahkan
            itemNameField.setText("");
            quantityField.setText("");
        } else if (e.getSource() == viewInventoryButton) {
            // Tidak ada implementasi untuk tombol "View Inventory" pada contoh ini
            JOptionPane.showMessageDialog(this, "View Inventory feature will be implemented soon.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FurniCraftGUI());
    }
}