package Pertemuan_6;

abstract class Hewan {
    //Mendeklarasikan class dan method tipe abstract
    protected abstract void munculSuara();
}

class Kucing extends Hewan {
    //Menggunakan method dari kelas induk abstrak
    protected void munculSuara(){
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }
}

class Burung extends Hewan {
    //Menggunakan method dari kelas induk abstrak
    protected void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }    
}

/*public*/ class polymorfOveride { //--> error karena menggunakan modifier public
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();
        
        Hewan burung = new Burung();
        burung.munculSuara();
    }
}