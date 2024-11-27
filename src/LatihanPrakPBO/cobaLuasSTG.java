package LatihanPrakPBO;

public class cobaLuasSTG {
    int a= 3;
    int b = 7;
    
    public void Luas(){
        double c = 0.5*(a+b);
        System.out.println("Luas Segitiga\t= 1/2 * (a+b)\n"
                + "\t\t= 1/2" + " * "  + "( "  +a + " + " + b + " )" );
        System.out.println("\t\t= " + c + "cm^2");
    }  
}

class Hasil {
    public static void main(String[] args) {
        cobaLuasSTG x = new cobaLuasSTG ();
        x.Luas();
    }   
}