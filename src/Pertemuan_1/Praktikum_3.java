package Pertemuan_1;
//Memodifikasi Atribut

public class Praktikum_3 {
    String nama= "Jerome Polin",
           jurusan= "Teknik Informatika";
    
    public static void main(String[] args) {
        Praktikum_3 mahasiswa= new Praktikum_3(); //object
        mahasiswa.nama= "Sheila Apriliani Putri";
        
        System.out.println(" Nama Mahasiswa : " +mahasiswa.nama);
        System.out.println(" Jurusan \t : " +mahasiswa.jurusan);
    }
}