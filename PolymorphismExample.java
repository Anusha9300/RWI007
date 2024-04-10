// Superclass
class Message {
    void display() {
        System.out.println("Displaying message");
    }
}

// Subclasse
class TextMessage extends Message {
    //Override method
    void display() {
        System.out.println("Displaying text message");
    }
}

// Another subclass
class ImageMessage extends Message {
    //Override method
    void display() {
        System.out.println("Displaying image message");
    }
}

//Main Method
public class PolymorphismExample {
    public static void main(String[] args) {
        Message myMessage1 = new TextMessage();
        Message myMessage2 = new ImageMessage();

        myMessage1.display(); // Output: Displaying text message
        myMessage2.display(); // Output: Displaying image message
    }
}
