/*
In this example, we declare two primitive type variables x and y with the same value of 5, and compare them using the == operator. Since primitive types are compared by their value, not their reference, the expression (x == y) evaluates to true.

We then declare two reference type variables s1 and s2, both containing the same string "Hello". However, s1 is initialized using a string literal, while s2 is initialized using the new keyword to create a new string object. When we compare these variables using the == operator, we get false because reference types are compared by their reference, not their value. Even though the strings contained in s1 and s2 are the same, they are stored at different memory locations, so their references are not equal.
*/

public class Example {
    public static void main(String[] args) {
        // Primitive type variables
        int x = 5;
        int y = 5;
        System.out.println("Primitive types: " + (x == y)); // Outputs: "Primitive types: true"

        // Reference type variables
        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.println("Reference types: " + (s1 == s2)); // Outputs: "Reference types: false"
    }
}
