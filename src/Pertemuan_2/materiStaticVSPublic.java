package Pertemuan_2;

class materiStaticVSPublic {
    //Static method
    static void MyStaticMethod(){
       System.out.println("Static method dapat dipanggil tanpa membuat object");
    }
    
    //Public method
    public void MyPublicMethod(){
       System.out.println("Static method dapat dipanggil tanpa membuat object");
    }
    //Main method
    public static void main(String[] args) {
        //myStaticMethod();
        
        //panggilmethod myObj = new panggilmethod();
        //myObj.myPublicMethod();
    }
}
