package Pertemuan_4;

class Praktikum_2 {

    private String username;
    private String password;
}

public class Praktikum2_user {

    public static void main(String[] args) {
        Praktikum_2 obj = new Praktikum_2();
        // menggunakan method setter
       /* obj.username = "blackpink";
        obj.password = "TeknikInformatika";
        // menggunakan method getter
        System.out.println("Username: " + obj.username);
        System.out.println("Password: " + obj.password);*/
    }
}

//error karena mengakses variabel dari luar kelas yang bersifat privat
//tidak ada enkapsulasi setter untuk mengatur data dan getter untuk mendapatkan data
