package UTS;

import java.util.Scanner;

public class OrderCaffe {
    private String menu;
    private String ice;
    private double harga;
    private double jmlBeli;

    public OrderCaffe() {
        Scanner input = new Scanner(System.in);

        System.out.println("==============INPUT JENIS MINUMAN===============");
        System.out.println("Jenis Minuman :");
        System.out.println("""
                           1. Cafe Latte
                           2. Machiato
                           3. Mochacino""");
        System.out.print("Input Pilihan (1-3) : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                menu = "Caffe Latte";
                break;
            case 2:
                menu = "Machiato";
                break;
            case 3:
                menu = "Mochacino";
                break;
            default:
                System.out.println("Pesanan Tidak Tersedia");
                return;
        }

        input.nextLine();  
        System.out.print("Pilih Ice/Hot (Ketik Ice/Hot) : ");
        ice = input.nextLine();
        while (!ice.equalsIgnoreCase("Ice") && !ice.equalsIgnoreCase("Hot")) {
            System.out.println("Mohon input Ice atau Hot.");
            System.out.print("Pilih Ice/Hot (Ketik Ice/Hot) : ");
            ice = input.nextLine();
        }

        System.out.print("Harga (Rp) : ");
        harga = input.nextDouble();
        System.out.print("Jumlah Pembelian : ");
        jmlBeli = input.nextDouble();
    }

    public String getMenu() {
        return menu;
    }

    public String getIce() {
        return ice;
    }

    public double getHarga() {
        return harga;
    }

    public double getJmlBeli() {
        return jmlBeli;
    }

    public double getTotal() {
        return jmlBeli * harga;
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
