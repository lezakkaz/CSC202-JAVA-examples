/*
In this example, the Person class has two constructors: a default constructor that sets the name and age fields to default values, and a parameterized constructor that allows the name and age fields to be initialized with specific values.

In the main method, we create two instances of the Person class - one using the default constructor and another using the parameterized constructor. We then call the sayHello method for each person to output their name and age. Since the first person was created using the default constructor, their name and age will be set to the default values of "Unknown" and 0, respectively.
*/

public class Person {
    private String name;
    private int age;

    public Person() {
        // Default constructor
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        // Parameterized constructor
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }

    public static void main(String[] args) {
        // Create a new person using the default constructor
        Person person1 = new Person();

        // Create another person using the parameterized constructor
        Person person2 = new Person("John Doe", 30);

        // Call the sayHello method for each person
        person1.sayHello(); // Outputs: "Hello, my name is Unknown and I am 0 years old."
        person2.sayHello(); // Outputs: "Hello, my name is John Doe and I am 30 years old."
    }
}