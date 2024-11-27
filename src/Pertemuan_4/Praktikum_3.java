package Pertemuan_4;

public class Praktikum_3 {

    private String username;
    private String password;

    //ini method setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ini method getter
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public static void main(String[] args) {
        Praktikum_3 obj = new Praktikum_3();
        //menggunakan method setter
        obj.setUsername("Sheila Apriliani Putri");
        obj.setPassword("Teknik Informatika");
        //menggunkan method getter
        System.out.println(" Username  : " + obj.getUsername());
        System.out.println(" Password  : " + obj.getPassword());
    }
}
