package Pertemuan_8;

interface Buah {

    public void buahWarna();

    public void rasa();  
}

class Jeruk implements Buah {

    @Override
    public void buahWarna() {
        System.out.println("Jeruk berwarna oranye");
    }

    @Override
    public void rasa() {
        System.out.println("Rasanya manis dan asam");
    }
}

class Wortel implements Buah {
    @Override
    public void buahWarna() {
        System.out.println("\nWortel berwarna oranye");
    }
    @Override
    public void rasa() {
        System.out.println("Rasanya manis");
    }
}

class Main {

    public static void main(String[] args) {
        Jeruk myFav = new Jeruk();
        myFav.buahWarna();
        myFav.rasa();
        
        Wortel noFav = new Wortel();
        noFav.buahWarna();
        noFav.rasa();
    }
}