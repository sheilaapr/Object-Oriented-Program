//coba modifikasi source code

package Pertemuan_4;
import java.util.Scanner;

public class beliBuku {
    private String judul;
    private String pengarang;
    private double harga;
    private double jmlBeli;
    private double total;  //total = harga*jmlBeli;
    
    public beliBuku(){
            //total = (harga*jmlBeli);
                 //System.out.println(" Nilai Akhir Mahasiswa: " + total);
                 
        Scanner input = new Scanner(System.in);
        
        System.out.println("==============INPUT PEMBELIAN BUKU===============");
        System.out.print(" Judul Buku \t: ");
        this.judul = input.nextLine();
        System.out.print(" Pengarang \t: ");
        this.pengarang = input.nextLine();
        System.out.print(" Harga Buku \t: ");
        this.harga = input.nextDouble();
        System.out.print(" Jumlah Pembelian : ");
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
        return total = this.harga*this.jmlBeli;
    }

    public void setTotal(double total) {
        this.total = this.harga*this.jmlBeli;
    }
    
        public static void main(String[] args) {
            
            beliBuku obj = new beliBuku();
            System.out.println("==============DATA PEMBELIAN===============");
            System.out.println(" Judul Buku \t: " + obj.getJudul());
            System.out.println(" Pengarang \t: " + obj.getPengarang());
            System.out.println(" Harga Buku \t: Rp.  " + obj.getHarga());
            System.out.println(" Jumlah Pembelian : Rp. " + obj.getJmlBeli());
            
            System.out.println("==============TOTAL PEMBAYARAN===============");
            System.out.println(" Total (Rp) \t: Rp.  " + obj.getTotal());
    }
}