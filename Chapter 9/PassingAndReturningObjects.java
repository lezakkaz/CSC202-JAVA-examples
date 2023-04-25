/* 
In this example, we define a Person class that represents a person with a name and age. The class has getters and setters for the name and age properties.

We then define a main method in another class called Example. In the main method, we create a new Person object called person1 and pass it to another method called printPersonDetails. This method prints out the details of the Person object passed to it.

We then change the properties of person1 and create another Person object called person2 using a static method called createPerson. This method takes two arguments, a name and an age, and returns a new Person object with those values.

Finally, we print out the details of person2 to the console.

When you run this code, it should output the following:

Person details: Name = John, Age = 25
Person 2 details: Name = Mark, Age = 20

This demonstrates how we can pass and return objects between different classes in Java. 
*/

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Example {
    public static void main(String[] args) {
        // Creating a new Person object
        Person person1 = new Person("John", 25);

        // Passing the Person object to another method
        printPersonDetails(person1);

        // Changing the Person object's properties
        person1.setName("Sarah");
        person1.setAge(30);

        // Returning the Person object from another method
        Person person2 = createPerson("Mark", 20);
        System.out.println("Person 2 details: Name = " + person2.getName() + ", Age = " + person2.getAge());
    }

    public static void printPersonDetails(Person person) {
        // Printing the details of the Person object
        System.out.println("Person details: Name = " + person.getName() + ", Age = " + person.getAge());
    }

    public static Person createPerson(String name, int age) {
        // Creating a new Person object and returning it
        return new Person(name, age);
    }
}
