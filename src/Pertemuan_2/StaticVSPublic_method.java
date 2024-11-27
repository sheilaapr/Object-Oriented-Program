package Pertemuan_2;

public class StaticVSPublic_method {
// Static method
    static void myStaticMethod() {
        System.out.println("Static method dapat dipanggil tanpa membuat object");
}
// Public method
    public void myPublicMethod() {
        System.out.println("Public method harus dipanggil dengan membuat object");
}
// Main method
    public static void main(String[] args) {
        myStaticMethod();
        StaticVSPublic_method myObj = new StaticVSPublic_method();
        myObj.myPublicMethod();
    }
}
