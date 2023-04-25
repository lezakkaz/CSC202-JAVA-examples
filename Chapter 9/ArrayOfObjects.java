/* 
In this example, we define a Person class that represents a person with a name and age. The class has getters and setters for the name and age properties.

We then define a main method in another class called Example. In the main method, we create an array of Person objects called people with a length of 3.

We then initialize the array with Person objects by creating new Person objects and assigning them to the elements of the array.

Finally, we loop through the array and access the properties of the Person objects in the array using the getName and getAge methods.

When you run this code, it should output the following:

Person 1 details: Name = John, Age = 25
Person 2 details: Name = Sarah, Age = 30
Person 3 details: Name = Mark, Age = 20

This demonstrates how we can use an array of objects to store and manipulate multiple objects of the same class in Java.
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
        // Creating an array of Person objects
        Person[] people = new Person[3];

        // Initializing the array with Person objects
        people[0] = new Person("John", 25);
        people[1] = new Person("Sarah", 30);
        people[2] = new Person("Mark", 20);

        // Accessing the properties of the Person objects in the array
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1) + " details: Name = " + people[i].getName() + ", Age = " + people[i].getAge());
        }
    }
}
