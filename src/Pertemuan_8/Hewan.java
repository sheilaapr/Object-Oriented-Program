package Pertemuan_8;
// Interface
interface Hewan {

    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Hewan {

    @Override
    public void animalSound() {
// The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void sleep() {
// The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}