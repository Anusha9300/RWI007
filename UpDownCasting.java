class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
	 // Upcasting
        Animal animal = new Dog();
        animal.sound(); 
        
        // Downcasting
        Dog dog = (Dog) animal;
        dog.wagTail();
    }
}
