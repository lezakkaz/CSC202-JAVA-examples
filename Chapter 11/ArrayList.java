/*
In this example, we create an ArrayList of integers called numbers. We use the add() method to add elements to the ArrayList, and the get() method to access elements of the ArrayList by index.

We use the set() method to modify an element of the ArrayList, and the remove() method to remove an element of the ArrayList by index. We use the size() method to get the size of the ArrayList.

We use a for loop to iterate over the elements of the ArrayList and print them to the console. We can also use an enhanced for loop, or the forEach() method, to iterate over the elements of the ArrayList.

Note that ArrayList is a resizable array implementation of the List interface in Java. It provides many useful methods for manipulating lists of elements, such as add(), get(), set(), remove(), size(), and many others.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers); // Output: ArrayList: [10, 20, 30]
        
        // Access elements of the ArrayList
        int firstNum = numbers.get(0);
        int secondNum = numbers.get(1);
        System.out.println("First element: " + firstNum); // Output: First element: 10
        System.out.println("Second element: " + secondNum); // Output: Second element: 20
        
        // Modify elements of the ArrayList
        numbers.set(1, 25);
        System.out.println("Modified ArrayList: " + numbers); // Output: Modified ArrayList: [10, 25, 30]
        
        // Remove an element from the ArrayList
        numbers.remove(2);
        System.out.println("ArrayList after removal: " + numbers); // Output: ArrayList after removal: [10, 25]
        
        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size); // Output: Size of ArrayList: 2
        
        // Iterate over the elements of the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (int i = 0; i < size; i++) {
            int num = numbers.get(i);
            System.out.println(num);
        }
        // Output: Iterating over the ArrayList:
        // 10
        // 25
    }
}