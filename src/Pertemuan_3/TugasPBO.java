//Tugas Praktikum PBO_Modul3

package Pertemuan_3;
import java.util.Scanner;

public class TugasPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ============ INPUT X dan Y ============");
        System.out.print(" X : ");
            double angka1 = input.nextDouble();
        System.out.print(" Y : ");
            double angka2 = input.nextDouble();
            
        System.out.println(" ============ Hasil Operasi ============");
        System.out.println(" Penjumlahan \t: " + penjumlahan(angka1,angka2));
        System.out.println(" Pengurangan \t: " + pengurangan(angka1,angka2));
        System.out.println(" Perkalian\t: " + perkalian(angka1,angka2));
        System.out.println(" Pembagian\t: " + pembagian(angka1,angka2));
        }
    
        public static double penjumlahan (double angka1, double angka2) {
            return angka1 + angka2;         
        }
        public static double pengurangan( double angka1, double angka2) {
             return angka1 -  angka2;      
        }
        public static double perkalian (double angka1, double angka2) {
             return angka1 *  angka2;   
        }
        public static double pembagian (double angka1, double angka2){       
            return angka1 / angka2;
        }
}