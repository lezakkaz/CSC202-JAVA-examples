/*In this example, we have a parent class called Animal that has a method called makeSound(). The child classes Dog and Cat inherit from the Animal class and override the makeSound() method to produce their respective sounds.

We then create objects of the child classes and call their overridden makeSound() methods, as well as an object of the parent class and call its makeSound() method.

We also create an array of Animal objects that holds objects of the child classes, and we use a for-each loop to call the makeSound() method of each object. This demonstrates polymorphism, where objects of different classes can be treated as objects of the parent class and their overridden methods are called based on their actual class at runtime.*/

// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Child class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // create objects of the child classes
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // calling the overridden makeSound() method of the child classes
        dog.makeSound(); // Output: The dog barks
        cat.makeSound(); // Output: The cat meows
        
        // create an object of the parent class and call the makeSound() method
        Animal animal = new Animal();
        animal.makeSound(); // Output: The animal makes a sound
        
        // create an array of Animal objects that holds objects of the child classes
        Animal[] animals = {dog, cat};
        for (Animal a : animals) {
            a.makeSound(); // Output: The dog barks, The cat meows
        }
    }
}

