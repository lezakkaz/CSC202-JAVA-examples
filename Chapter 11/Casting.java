/*
In this example, we have a Dog class that extends the Animal class and overrides the makeSound() method to produce a "bark" sound. We then create an Animal object and a Dog object.

We perform implicit casting by assigning the Dog object to an Animal variable, which is allowed because Dog is a subclass of Animal. This is an example of upcasting, where we move up the inheritance hierarchy from a subclass to its superclass. We then call the makeSound() method on the Animal variable, which actually calls the overridden makeSound() method in the Dog class, and produces the output The dog barks.

We also perform explicit casting by assigning the Animal object to a Dog variable using the (Dog) syntax. This is allowed because the Animal object is actually a Dog object, and we can cast it back to its original type. This is an example of downcasting, where we move down the inheritance hierarchy from a superclass to its subclass. We then call the makeSound() method on the Dog variable, which again produces the output The dog barks.

Note that explicit casting can result in a ClassCastException if the object being cast is not actually an instance of the target class, so it should be used carefully and only when necessary.
*/

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

	  // Implicit casting of primitive types
        int num1 = 10;
        double num2 = num1;
        System.out.println(num2); // Output: 10.0
        
        // Explicit casting of primitive types
        double num3 = 3.14159;
        int num4 = (int) num3;
        System.out.println(num4); // Output: 3

        // Implicit casting from subclass to superclass
        Animal animal = new Dog();
        animal.makeSound(); // Output: The dog barks

        // Explicit casting from superclass to subclass
        Animal animal2 = new Animal();
        Dog dog = (Dog) animal2;
        dog.makeSound(); // Output: The dog barks
    }
}



