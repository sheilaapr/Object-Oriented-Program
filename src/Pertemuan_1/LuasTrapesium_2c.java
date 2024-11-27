package Pertemuan_1;

    //Luas Trapesium L=1/2*(a+b)*t
public class LuasTrapesium_2c {
    double setengah=0.5, a, b, t;
    
    public void LuasTrap(){
        double luas;
        luas = setengah* (a+b)* t;
            System.out.println(
                "========================================"+
                "\n\t MENGHITUNG LUAS TRAPESIUM" +
                "\n========================================");
            
            System.out.println(
                    "Rumus Luas = 1/2 x (a+b) x t" +
                    "\nLuas Trapesium = " + luas);
    }
    
    public static void main(String[] args) {
        LuasTrapesium_2c total = new LuasTrapesium_2c();
        total.a = 28;
        total.b = 18;
        total.t = 10;
        total.LuasTrap(); 
    }
}
