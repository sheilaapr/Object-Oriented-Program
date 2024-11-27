package LatihanPrakPBO;

public class W3S_MultipleAttributes {
    String name1= "Sheila";
    String name2= "Apriliani";
    int umur= 20;
    
    public static void main(String[] args) {
        W3S_MultipleAttributes obj = new W3S_MultipleAttributes ();
        System.out.println("Nama Panggilan\t: " + obj.name1);
        System.out.println("Nama Lengkap\t: " + obj.name1 + " " + obj.name2);
        System.out.println("Umur\t\t: " + obj.umur);
    }
}
