//Contoh method mengembalikan nilai (return)
package Pertemuan_3;

public class Praktikum_2 {

    static int kuadrat(int bil) {
        return bil * bil;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x + " kuadrat adalah " + kuadrat(x));
    }
}
