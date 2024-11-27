//NO. 2b
//MENGHITUNG LUAS PERSEGI PANJANG

package Pertemuan_1;
import java.util.Scanner;

public class tryTugasPBO_2b{
    //Luas persegi panjang = p*l
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        double p, l, LuasPP;
        
            System.out.println
            ("================================================="+
             "\n\t MENGHITUNG LUAS PERSEGI PANJANG" +
            "\n=================================================");
        
            System.out.print("Masukkan Panjang: ");
            p = input.nextDouble();
            
            System.out.print("Masukkan Lebar: ");
            l = input.nextDouble();
            
            LuasPP = luasP(p, l);
            System.out.println("Luas Persegi Panjang= " + LuasPP + " cm^2" );
        }
        
    private static double luasP(double p, double l) {
        double hasilLuasPP = p*l;
        return hasilLuasPP;
        }
        
    }