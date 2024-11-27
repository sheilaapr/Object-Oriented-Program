package Pertemuan_5;

class Komputer {
    String processor = "Intel Core i9";
    
    String cekKomputer() {
        return "Ini berasal dari class Komputer";
    }
}

class Laptop extends Komputer {
    String merk = "Acer";
    
    String cekLaptop(){
        return "Ini berasal dari class Laptop";
    }
}

class belajarInheritance {
    public static void main(String[] args) {
        Laptop laptopSheila = new Laptop() ;
        
        System.out.println (laptopSheila.processor);
        System.out.println (laptopSheila.merk);
        System.out.println (laptopSheila.cekKomputer());
        System.out.println (laptopSheila.cekLaptop());
    }
}