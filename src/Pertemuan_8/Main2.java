package Pertemuan_8;

// Interface
interface Fruit {

    // Abstract method
    void eat();
}

// Concrete class implementing the Fruit interface
class Apple implements Fruit {

    @Override
    public void eat() {
        System.out.println("Eating an apple.");
    }

    public void peel() {
        System.out.println("Peeling an apple.");
    }
}

// Concrete class implementing the Fruit interface
class Banana implements Fruit {

    @Override
    public void eat() {
        System.out.println("Eating a banana.");
    }

    public void peel() {
        System.out.println("Peeling a banana.");
    }
}

// Main class
public class Main2 {

    public static void main(String[] args) {
        // Creating objects of the Apple and Banana classes
        Apple apple = new Apple();
        Banana banana = new Banana();

        // Calling methods
        apple.eat();    // Output: Eating an apple.
        apple.peel();   // Output: Peeling an apple.

        banana.eat();   // Output: Eating a banana.
        banana.peel();  // Output: Peeling a banana.
    }
}