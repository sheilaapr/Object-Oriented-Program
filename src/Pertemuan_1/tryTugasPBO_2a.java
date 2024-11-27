//NO. 2a
//MENGHITUNG LUAS TABUNG

package Pertemuan_1;
import java.util.Scanner;

public class tryTugasPBO_2a {
    //Luas isi tabung L=2.pi.r(r.t)
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double phi = 3.14;
        double jari, tinggi, luasP;
        
            System.out.println
                ("========================================"+
                "\n\t MENGHITUNG LUAS TABUNG" +
                "\n========================================");
        
            System.out.print("Masukkan Jari-jari: "); 
            jari = input.nextDouble();
        
            System.out.print("Masukkan Tinggi\t   : ");
            tinggi = input.nextDouble();
        
            luasP = luasTab(jari, tinggi);
            System.out.println("Luas Tabung\t   = " + luasP + " cm^2");
    }
    
    private static double luasTab (double r, double t){
        double phi = 3.14f ;
        double hasilLuasTab = 2*phi*r*(r+t);
        return hasilLuasTab;               
    }   
}
