package Pertemuan_4;

class Praktikum_1 {
    //public String username; --> ubah ke private agar tidak bisa diakses diluar kelas
    //public String password; --> ubah ke private agar tidak bisa diakses diluar kelas

    private String username;
    private String password;

//menambahkan setter dan getter
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}

public class User {  // user --> User : sesuai dg penamaan java, kapital

    public static void main(String[] args) {
        Praktikum_1 obj = new Praktikum_1();

        // menggunakan method setter
        obj.setUsername /*=*/("blackpink");
        //error karena ada sama dengan, TIDAK PERLUUU
        obj.setPassword /*= */("TeknikInformatika");
        //error karena ada sama dengan, TIDAK PERLUUU

        // menggunakan method getter
        System.out.println("Username: " + obj.getUsername());
        System.out.println("Password: " + obj.getPassword());
    }
}

//error karena tidak ada enkapsulasi dan langsung akses variabel luar kelas
