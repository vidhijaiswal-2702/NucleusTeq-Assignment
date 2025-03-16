/*Interface: An interface is a completely abstract type that only contains abstract methods (before Java 8) and default/static methods (from Java 8 
onwards). It enforces full abstraction, meaning classes that implement an interface must define all its methods. 
• The interface in Java is a mechanism to achieve abstraction. 
• By default, variables in an interface are public, static, and final. 
• It is used to achieve abstraction and multiple inheritances in Java. 
• It is also used to achieve loose coupling. 
• In other words, interfaces primarily define methods that other classes must implement. 
• An interface in Java defines a set of behaviours that a class can implement,usually representing an IS-A relationship, but not always in every scenario. 
• We can create an interface using interface keyword. 

Advantages of Interfaces: 
• Without bothering about the implementation part, we can achieve the 
security of the implementation. 
• In Java, multiple inheritances are not allowed, however, you can use an */


interface Vehicle {
    void start(); 
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting with key ignition...");
    }
}

// Main Class
public class interfaces {
    public static void main(String[] args) {
       
        Car car = new Car();
        car.start();
    }
}

    

