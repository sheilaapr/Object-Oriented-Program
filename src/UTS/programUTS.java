package UTS;

import java.util.Scanner;

public class programUTS {

    private String jenisMinuman;
    private String pilihan;
    private int harga;
    private int jumlah;

    public void setJenisMinuman(String jm) {
        this.jenisMinuman = jm;
    }

    public String getJenisMinuman() {
        return this.jenisMinuman;
    }

    public void setPilihan(String p) {
        this.pilihan = p;
    }

    public String getPilihan() {
        return this.pilihan;
    }

    public void setHarga(int h) {
        this.harga = h;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setJumlah(int j) {
        this.jumlah = j;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    static int perkalian(int bil1, int bil2) {
        return bil1 * bil2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        programUTS obj = new programUTS();

        System.out.println("=========== INPUT JENIS MINUMAN ===========");
        System.out.println("Jenis Minuman : ");
        System.out.println("1. Cafe Latte \n 2. Machiato \n 3. Mochaccino");
        System.out.print("Input Pilihan (1-3) : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                obj.setJenisMinuman("Cafe Latte");
                System.out.println("Pilihan Anda : " + obj.getJenisMinuman());
                break;
            case 2:
                obj.setJenisMinuman("Machiato");
                System.out.println("Pilihan Anda : " + obj.getJenisMinuman());
                break;
            case 3:
                obj.setJenisMinuman("Mochaccino");
                System.out.println("Pilihan Anda : " + obj.getJenisMinuman());
                break;
        }
        System.out.print("Pilih Ice/Hot (Ketik) : ");
        obj.setPilihan(input.next());
        System.out.print("Harga (Rp) : ");
        obj.setHarga(input.nextInt());
        System.out.print("Jumlah Pembelian : ");
        obj.setJumlah(input.nextInt());
        System.out.println("============ DAFTAR PEMBELIAN ============");
        System.out.println("Jenis Minuman : " + obj.getJenisMinuman());
        System.out.println("Ice/Hot : " + obj.getPilihan());
        System.out.println("Harga (Rp) : " + obj.getHarga());
        System.out.println("Jumlah Pembelian : " + obj.getJumlah());
        System.out.println("============ TOTAL PEMBAYARAN ============");
        System.out.println("Total (Rp) : " + perkalian(obj.getHarga(), obj.getJumlah()));
    }
}
