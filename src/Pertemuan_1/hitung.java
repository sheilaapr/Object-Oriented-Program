package Pertemuan_1;
// Membuat Method

class Praktikum_4{
    double a, b;
    public void hasilKali(){
        double c;
        c= a* b;
        System.out.println("Hasil Perkalian : " +a+ " x " +b+ " = " +c);
    }
}
        //public class hitung {
        class hitung{
        public static void main(String[] args) {
            Praktikum_4 objKali = new Praktikum_4();
            objKali.a=32;
            objKali.b=21;
            objKali.hasilKali();
    }
}