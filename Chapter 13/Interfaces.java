/*
Interfaces: 
An interface in Java is a completely abstract class that can have only abstract methods. 
The methods in interfaces are implicitly public and abstract. 
Interfaces are not part of the class hierarchy and a class can implement one or more interfaces.

Note: Interfaces can be implemented by any class, from any inheritance tree. 
This makes interfaces very flexible, while abstract classes are restricted to a single inheritance tree.
*/

// Declare an interface named Animal
interface Animal {
    void animalSound(); // interface method (does not have a body)

    void sleep(); // interface method (does not have a body)

    void setName(String name); // interface method (does not have a body)

    String getName(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    private String name;

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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

Animal is an interface that contains four methods.
Pig is a class that "implements" the Animal interface. In other words, Pig provides an implementation for all the methods in the Animal interface.
In the Main class, we create an instance of Pig and call the setName(), getName(), animalSound(), and sleep() methods.
*/