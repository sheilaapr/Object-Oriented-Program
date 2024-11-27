package Pertemuan_8;

abstract class Fruit {

    public abstract void fruitColor();

    public void rasa() {
        System.out.println("Rasanya Enak\n");
    }
    
    public void rasa2() {
        System.out.println("Rasanya tidak enak");
    }
    
    public void bentuk() {
        System.out.println("Bentuknya bulat");
    }
}

class Orange extends Fruit {

    @Override
    public void fruitColor() {
        System.out.println("\nJeruk adalah makanan favorit saya!");
    }
}

class Guava extends Fruit {

    @Override
    public void fruitColor() {
        System.out.println("Jambu adalah buah yang tidak saya suka");
    }
}

class Main {

    public static void main(String[] args) {
        Orange myFav = new Orange();
        Guava noFav = new Guava();
        myFav.fruitColor();
        myFav.bentuk();
        myFav.rasa();
        
        noFav.fruitColor();
        noFav.bentuk();
        noFav.rasa2();
    }
}