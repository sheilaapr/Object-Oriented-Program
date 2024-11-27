package Pertemuan_4;

import java.util.Scanner;

public class jualBuku {

    private String judul;
    private String pengarang;
    private double harga;
    private double jmlBeli;
    private double total;

    //Constructor
    public jualBuku() {
        Scanner input = new Scanner(System.in);

        System.out.println(" =============INPUT PEMBELIAN BUKU================");
        System.out.print("Masukkan Judul Buku: ");
        this.judul = input.nextLine();
        System.out.print("Masukkan Nama Pengarang: ");
        this.pengarang = input.nextLine();
        System.out.print("Masukkan Harga Buku: ");
        this.harga = input.nextDouble();
        System.out.print("Masukkan Jumlah Pembelian: ");
        this.jmlBeli = input.nextDouble();
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJmlBeli() {
        return jmlBeli;
    }

    public void setJmlBeli(double jmlBeli) {
        this.jmlBeli = jmlBeli;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
