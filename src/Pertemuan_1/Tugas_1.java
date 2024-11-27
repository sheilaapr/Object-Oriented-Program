//Soal NO. 1
package Pertemuan_1;


public class Tugas_1 {
    /*final*/ int x = 10;
    //hapus kata final agar variabel bisa diubah
    
    public static void main(String[] args) {
        Tugas_1 myObj = new Tugas_1();
        //error
        myObj.x = 25;
        
        System.out.println(myObj.x);
        
    }
    
}

//Hasil running =  25, error karena ada tipe data final yang menandakan tidak ada proses lagi