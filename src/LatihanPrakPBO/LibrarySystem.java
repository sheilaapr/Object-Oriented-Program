package LatihanPrakPBO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        // Menambahkan beberapa buku contoh
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}

public class LibrarySystem extends JFrame {
    private JComboBox<Book> bookComboBox;
    private JTextField nameTextField;
    private JButton borrowButton;

    private Library library;

    public LibrarySystem() {
        setTitle("Library System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        library = new Library();

        JLabel bookLabel = new JLabel("Select a Book:");
        bookComboBox = new JComboBox<>(library.getBooks().toArray(new Book[0]));

        JLabel nameLabel = new JLabel("Your Name:");
        nameTextField = new JTextField();

        borrowButton = new JButton("Borrow");
        borrowButton.addActionListener(new BorrowButtonListener());

        add(bookLabel);
        add(bookComboBox);
        add(nameLabel);
        add(nameTextField);
        add(borrowButton);
    }

    private class BorrowButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Book selectedBook = (Book) bookComboBox.getSelectedItem();
            String borrowerName = nameTextField.getText();
            if (borrowerName.isEmpty()) {
                JOptionPane.showMessageDialog(LibrarySystem.this, "Please enter your name.");
            } else {
                JOptionPane.showMessageDialog(LibrarySystem.this, "Thank you, " + borrowerName +
                        ", for borrowing " + selectedBook.getTitle() + ".");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LibrarySystem librarySystem = new LibrarySystem();
                librarySystem.setVisible(true);
            }
        });
    }
}