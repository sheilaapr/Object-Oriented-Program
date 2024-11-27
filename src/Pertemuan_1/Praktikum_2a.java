package Pertemuan_1;
//Membuat Object

public class Praktikum_2a {  //nama kelas
    String nama,jurusan;     //atribut atau variabel
    public static void main(String[] args) {
        Praktikum_2a mahasiswa1= new Praktikum_2a(); //object
        mahasiswa1.nama= "Sheila Apriliani Putri";
        mahasiswa1.jurusan= "Teknik Informatika";
        
        Praktikum_2a mahasiswa2= new Praktikum_2a(); //object
        mahasiswa2.nama= "Milley Cyrus";
        mahasiswa2.jurusan= "Teknik Arsitektur";
        
        System.out.println("Nama Mahasiswa : " +mahasiswa1.nama);
        System.out.println("Jurusan \t: " +mahasiswa1.jurusan);
        System.out.println("Nama Mahasiswa : " +mahasiswa2.nama);
        System.out.println("Jurusan \t: " +mahasiswa2.jurusan);
    }
}
