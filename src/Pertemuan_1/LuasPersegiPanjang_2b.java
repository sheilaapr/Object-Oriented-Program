package Pertemuan_1;

    //Luas Persegi Panjang L=p*l
public class LuasPersegiPanjang_2b {
    double panjang, lebar;
    
    public void LuasPP(){
        double luas;
        luas = panjang *lebar;
            System.out.println(
                "========================================"+
                "\n\t MENGHITUNG LUAS PERSEGI PANJANG" +
                "\n========================================");
        
            System.out.println(
                "Rumus Luas = p x l" +
                "\nLuas Persegi Panjang = " + luas);
    }
    
    public static void main(String[] args) {
        LuasPersegiPanjang_2b total = new LuasPersegiPanjang_2b();
        total.panjang = 4;
        total.lebar = 2;
        total.LuasPP();
    }
}
