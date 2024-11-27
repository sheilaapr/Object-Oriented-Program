package UTS;

import java.util.Scanner;

public class Order {

    private String menu;
    private double pilihan;
    private int order;
    private String ice;
    private double harga;
    private double jmlBeli;
    private double total;

    public Order() {
        Scanner input = new Scanner(System.in);

        System.out.println("==============INPUT JENIS MINUMAN===============");
        System.out.println("Jenis Minuman :");
        System.out.println("""
                           1. Cafe Latte
                           2. Machiato
                           3. Mochacino""");
        System.out.print("Input Pilihan (1-3) : ");
        pilihan = input.nextDouble();
        switch (order) {
            case '1' :
                System.out.println("Pilihan Anda : Caffe Latte");
            case '2' :
                System.out.println("Pilihan Anda : Machiato");
            case '3' :
                System.out.println("Pilihan Anda : Mochacino");
            default :
                System.out.println("Pesanan Tidak Tersedia");
        }
        input.nextLine();
        System.out.print("Pilih Ice/Hot (Ketik) : ");
        ice = input.nextLine();
        System.out.print("Harga (Rp) : ");
        harga = input.nextDouble();
        System.out.print("Jumlah Pembelian : ");
        jmlBeli = input.nextDouble();
    }

    public double getPilihan() {
        return pilihan;
    }

    public void setPilihan(double pilihan) {
        this.pilihan = pilihan;
    }

    public double getMenu() {
        return pilihan;
    }

    public void setPilihan(String Menu) {
        this.pilihan = pilihan;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
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
        return total = this.jmlBeli * this.harga;
    }

    public void setTotal(double total) {
        this.total = this.jmlBeli * this.harga;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opsi;

        do {
            Order x = new Order();

            System.out.println("==============DAFTAR PEMBELIAN===============");
            System.out.println("Jenis Minuman : " + x.getMenu());
            System.out.println("Ice/Hot : " + x.getIce());
            System.out.println("Harga (Rp) : " + x.getHarga());
            System.out.println("Jumlah Pembelian : " + x.getJmlBeli());

            System.out.println("==============TOTAL PEMBAYARAN===============");
            System.out.println("Total (Rp) \t: Rp. " + x.getTotal());

            System.out.println("=========================================");
            System.out.println("Order lagi? (Iya/Tidak)");
            opsi = scanner.next();
        } while ("Iya".equalsIgnoreCase(opsi));

        System.out.println("Terima kasih!");
        scanner.close();
    }
}