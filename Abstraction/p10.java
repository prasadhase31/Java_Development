
// Abstract class
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inheriting from Animal)
class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class p10{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // Output: Dog barks
        d.sleep();   // Output: Sleeping...
    }
}