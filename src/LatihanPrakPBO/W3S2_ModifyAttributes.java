package LatihanPrakPBO;
//Attributes

public class W3S2_ModifyAttributes {
    int x = 5;

    //modif atribut
    public static void main(String[] args) {
        W3S2_ModifyAttributes myObj1 = new W3S2_ModifyAttributes();
        W3S2_ModifyAttributes myObj2 = new W3S2_ModifyAttributes();
        myObj2.x = 10;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
