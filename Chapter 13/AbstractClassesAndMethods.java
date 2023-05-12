/*

Abstract Classes: 
An abstract class in Java is a class that can't be instantiated. 
It is used to declare or define methods but doesn't implement them. 
It can have both abstract and non-abstract methods (method with body). 
It needs to be extended and its method(s) implemented. 
It cannot be instantiated with the new keyword.

Abstract Methods: 
An abstract method is a method declared in an abstract class without an implementation. 
Subclasses of the abstract class are generally responsible for implementing these methods.

Note: If a class has any abstract methods, whether they are declared or inherited, the entire class must be declared abstract.

*/

// Declare an abstract class named Animal
abstract class Animal {
    protected String name;

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }

    // Regular method
    public void setName(String name) {
        this.name = name;
    }

    // Regular method
    public String getName() {
        return this.name;
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.setName("Porky");
        System.out.println("Animal Name: " + myPig.getName());
        myPig.animalSound();
        myPig.sleep();
    }
}

/* 

In the above example:

Animal is an abstract class that contains one abstract method named animalSound() and three non-abstract methods.
Pig is a subclass of Animal (indicated by extends). Pig provides an implementation for the abstract method animalSound().
In the Main class, we create an instance of Pig and call the setName(), getName(), animalSound(), and sleep() methods.

*/