package Pertemuan_9;

import javax.swing.*;

public class GUI1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton tombol = new JButton ("Tombol");
        f.add(tombol); //bukan f.tombol, karena bukan object
        f.setSize(200, 100);
        f.setVisible(true);
    }
}