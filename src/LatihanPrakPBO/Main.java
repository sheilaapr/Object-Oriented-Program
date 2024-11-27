package LatihanPrakPBO;
import java.util.Scanner;

// Contoh kelas induk (Parent Class)
class Hewan {
    private String jenis;

    // Constructor
    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    // Enkapsulasi
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Method
    public void bersuara() {
        System.out.println("Hewan ini bersuara...");
    }

    // Polymorphism
    public void makan() {
        System.out.println("Hewan ini sedang makan...");
    }
}

// Contoh kelas turunan (Child Class)
class Kucing extends Hewan {
    public Kucing(String jenis) {
        super(jenis);
    }

    // Overriding
    @Override
    public void bersuara() {
        System.out.println("Meow...");
    }

    // Overriding dengan Polymorphism
    @Override
    public void makan() {
        System.out.println("Kucing sedang makan ikan...");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari keyboard untuk jenis hewan
        System.out.print("Masukkan jenis hewan (Kucing/Sapi): ");
        String jenisHewan = scanner.nextLine();

        // Object dengan Constructor
        Hewan hewan;

        if ("Kucing".equalsIgnoreCase(jenisHewan)) {
            hewan = new Kucing(jenisHewan);
        } else {
            hewan = new Hewan(jenisHewan);
        }

        // Method dari object
        hewan.bersuara();

        // Enkapsulasi
        System.out.println("Jenis hewan: " + hewan.getJenis());

        // Polymorphism
        hewan.makan();
    }
}