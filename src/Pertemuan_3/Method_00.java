package Pertemuan_3;

public class Method_00 {
        //Fungsi
            public double luas_lingkaran (int diameter){
                  int jari2 = diameter/2;
                  double luas = Math.PI * Math.pow (jari2,2);
                  return luas;
            }
        //Prosedur
            public void hitungLuasLingkaran (int jari2){
                double luas = Math.PI * Math.pow (jari2,2);
                System.out.println(luas);
            }
            public static void main(String[] args) {
                    Method_00 mt = new Method_00();
                    mt. hitungLuasLingkaran(10);
                    System.out.println(mt.luas_lingkaran(20));
                    System.exit(0);
    }
}
