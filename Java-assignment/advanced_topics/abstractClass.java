/*
An abstract class is a class that cannot be instantiated and may contain both 
abstract methods (without a body) and concrete methods (with implementations). 
It provides partial implementation, meaning child classes must override abstract 
methods to define specific behavior. Java abstract class is a class that cannot be 
instantiated by itself, it needs to be subclassed by another class to use its 
properties. An abstract class is declared using the “abstract” keyword in its class 
definition.
 */

abstract class Animal {
    String name; 

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Main Class
public class abstractClass {
    public static void main(String[] args) {
        
        Dog dog = new Dog("Buddy");
        dog.displayInfo();
        dog.makeSound();
    }
}
