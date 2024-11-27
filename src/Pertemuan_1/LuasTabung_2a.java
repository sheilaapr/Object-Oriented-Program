package Pertemuan_1;

    //Luas isi tabung L=2.pi.r(r.t)
public class LuasTabung_2a {
    double jariJari, tinggi;
    
    public void LuasTabung(){
        double luas;
        luas = 2*Math.PI*jariJari*(jariJari*tinggi);
            System.out.println
                ("========================================"+
                "\n\t MENGHITUNG LUAS TABUNG" +
                "\n========================================");
        
            System.out.println(
                "Rumus Luas = " + 2 + " Phi * r(r*t)" +
                "\nLuas Tabung = " + luas);
    }
    
    public static void main(String[] args) {
        LuasTabung_2a total = new LuasTabung_2a();
        total.jariJari = 4;
        total.tinggi = 6;
        total.LuasTabung();
    }
}