package Pertemuan_2;

import java.util.Scanner;

public class Tugas_1 {

    double tugas, uts, uas;

    public void nilaiAkhirMahasiswa() {

        double nilaiAkhir = 0;
        nilaiAkhir = (tugas + uts + uas) / 3;
        System.out.println(" Nilai Akhir Mhasiswa : " + nilaiAkhir);
        //  public  Tugas_1{
        //   System.out.println(" ============NILAI AKHIR===========");System.out.println("");
    }

    public static void main(String[] args) {

        Tugas_1 nilai = new Tugas_1();

        String nama, prodi, fakultas;
        Scanner input = new Scanner(System.in);

        System.out.println(" ============INPUT DATA===========");

        System.out.print(" Nama \t\t: ");
        nama = input.nextLine();
        System.out.print(" Prodi \t\t: ");
        prodi = input.nextLine();
        System.out.print(" Fakultas \t: ");
        fakultas = input.nextLine();
        //System.out.print(" Nilai Praktikum/Tugas : ");
        //tugas = input.nextLine();
        //System.out.print(" Nilai UTS \t: ");
        //uts = input.nextLine();
        //System.out.print(" Nilai UAS \t: ");
        //uas = input.nextLine();

        System.out.println(" ============CETAK DATA===========");

        System.out.println(" Nama \t\t: " + nama);
        System.out.println(" Prodi \t\t: " + prodi);
        System.out.println(" Fakultas \t: " + fakultas);

        //public class nilaiAkhir{
        //   Tugas_1 hasil = new Tugas_1();
        System.out.println(" ============NILAI AKHIR===========");
        // nilaiAkhirMahasiswa();
        nilai.nilaiAkhirMahasiswa();
    }

    /* double nilaiTugas = 0;
       double nilaiUTS = 0;
       double nilaiUAS = 0;
       double nilaiAkhir = (nilaiTugas+nilaiUTS+nilaiUAS)/3;
       
    Scanner input = new Scanner(System.in);
        System.out.print(" Nilai Praktikum/Tugas : ");
        nilaiTugas = input.nextInt();
        System.out.print(" Nilai UTS \t: ");
        nilaiUTS = input.nextInt();
        System.out.print(" Nilai UAS \t: ");
        nilaiUAS = input.nextInt();
        System.out.println("");
        
        System.out.println(" Nilai Akhir Mahasiswa : " +nilaiAkhir);*/
}
