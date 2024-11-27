package Pertemuan_1;
//Membuat 

class Mahasiswa { //nama kelas
    String nama;     //atribut atau variabel
    String jurusan;
}
public class Praktikum_2b{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(); //Object
        mahasiswa1.nama= "Cinta Laura";
        mahasiswa1.jurusan= "Teknik Informatika";
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama= "Cinta Kasih";
        mahasiswa2.jurusan= "Teknik Arsitektur";

        System.out.println(" Nama Mahasiswa : " + mahasiswa1.nama);
        System.out.println(" Jurusan \t: " + mahasiswa1.jurusan);
        System.out.println(" Nama Mahasiswa : " + mahasiswa1.nama);
        System.out.println(" Jurusan \t: " + mahasiswa1.jurusan);
    }
}