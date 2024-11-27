package LatihanPrakPBO;
import java.util.Scanner;

public class LatihanTugas1_Pertemuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();

        // Input bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();

        // Pilih operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();

        // Hitung hasil operasi
        int hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = Penjumlahan(bil1, bil2);
                break;
            case 2:
                hasil = Pengurangan(bil1, bil2);
                break;
            case 3:
                hasil = Perkalian(bil1, bil2);
                break;
            case 4:
                hasil = Pembagian(bil1, bil2);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        // Tampilkan hasil
        if (pilihan >= 1 && pilihan <= 4) {
            System.out.println("Hasil operasi " + bil1 + " " + getOperator(pilihan) + " " + bil2 + " = " + hasil);
        }
    }

    public static int Penjumlahan(int a, int b) {
        return a + b;
    }

    public static int Pengurangan(int a, int b) {
        return a - b;
    }

    public static int Perkalian(int a, int b) {
        return a * b;
    }

    public static int Pembagian(int a, int b) {
        return a / b;
    }

    public static String getOperator(int pilihan) {
        switch (pilihan) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }
}