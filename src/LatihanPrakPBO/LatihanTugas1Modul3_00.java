package LatihanPrakPBO;
import java.util.Scanner;
public class LatihanTugas1Modul3_00 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan dua angka:");
        double angka1 = scanner.nextDouble();
        double angka2 = scanner.nextDouble();
        
        System.out.println("Hasil Penjumlahan: " + penjumlahan(angka1, angka2));
        System.out.println("Hasil Pengurangan: " + pengurangan(angka1, angka2));
        System.out.println("Hasil Perkalian: " + perkalian(angka1, angka2));
        System.out.println("Hasil Pembagian: " + pembagian(angka1, angka2));
        
        scanner.close();
    }

    public static double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double pembagian(double angka1, double angka2) {
        if (angka2 == 0) {
            System.out.println("Error: Pembagian dengan nol tidak bisa dilakukan.");
            return Double.NaN; // NaN (Not a Number) sebagai hasil pembagian dengan nol
        } else {
            return angka1 / angka2;
        }
    }
}
