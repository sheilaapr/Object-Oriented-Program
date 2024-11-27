//NO. 2b
//MENGHITUNG LUAS TRAPESIUM

package Pertemuan_1;
import java.util.Scanner;

public class tryTugasPBO_2c{
    //Luas Trapesium = 0.5 * (a+b) * t
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
            
        double stgh = 0.5;
        double a, b, t, LuasTrap;
            
            System.out.println
                ("===================================================="+
                "\n\t MENHITUNG LUAS TRAPESIUM"+
                "\n====================================================");
                
            System.out.print("Masukkan nilai a : ");
            a = input.nextDouble();
                
            System.out.print("Masukkan nilai b : ");
            b = input.nextDouble();
                
            System.out.print("Masukkan nilai t : ");
            t = input.nextDouble();
                
            LuasTrap = LuasT(a, b, t);
            System.out.println("Luas Trapesium = " + LuasTrap + " cm^2");
    }
    private static double LuasT(double a, double b, double t) {
        double stgh = 0.5f;
        double hasilLuasTrap = stgh * (a+b) * t;
        return hasilLuasTrap;
    }
}