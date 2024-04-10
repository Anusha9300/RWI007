//Super class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

//SubClass extends super class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class Upcasting {
    public static void main(String[] args) {
		// Upcasting
        Animal animal = new Dog(); 
		
        animal.sound(); 
    }
}
