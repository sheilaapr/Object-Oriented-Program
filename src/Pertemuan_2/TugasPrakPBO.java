package Pertemuan_2;

import java.util.Scanner;

public class TugasPrakPBO {

    double nilaiAkhir = 0;

    public void nilaiAkhirMhs(double tugas, double uts, double uas) {
        nilaiAkhir = (tugas + uts + uas) / 3;
        System.out.println(" Nilai Akhir Mahasiswa: " + nilaiAkhir);
    }

    public static void main(String[] args) {
        String nama, prodi, fakultas;
        double tugas, uts, uas, nilaiAkhir;

        TugasPrakPBO nilai = new TugasPrakPBO();
        Scanner input = new Scanner(System.in);

        System.out.println(" ===============INPUT DATA==============");
        System.out.print(" Nama \t\t: ");
        nama = input.nextLine();
        System.out.print(" Prodi \t\t: ");
        prodi = input.nextLine();
        System.out.print(" Fakultas \t: ");
        fakultas = input.nextLine();
        System.out.print(" Nilai Praktikum/Tugas \t: ");
        tugas = input.nextInt();
        System.out.print(" Nilai UTS \t: ");
        uts = input.nextInt();
        System.out.print(" Nilai UAS \t: ");
        uas = input.nextInt();

        System.out.println(" ===============CETAK DATA==============");
        System.out.println(" Nama \t\t: " + nama);
        System.out.println(" Prodi \t\t: " + prodi);
        System.out.println(" Fakultas \t: " + fakultas);
        System.out.println(" Nilai Prak/Tugas : " + tugas);
        System.out.println(" Nilai UTS \t: " + uts);
        System.out.println(" Nilai UAS \t: " + uas);

        System.out.println(" ===============NILAI AKHIR==============");
        nilai.nilaiAkhirMhs(tugas, uts, uas);
    }
}
