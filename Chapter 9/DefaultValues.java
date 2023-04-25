/* 
In this example, we define a class Example with several fields, all of which have default values. The int field x defaults to 0, the double field y defaults to 0.0, the boolean field z defaults to false, and the String field s defaults to null.

We also define a printValues method that simply outputs the values of these fields to the console.

In the main method, we create an instance of the Example class using the default constructor, and call the printValues method to output the default values of the fields.

When we run this code, we should see the following output:

x: 0
y: 0.0
z: false
s: null

This demonstrates how the fields in a class can have default values assigned to them, which are used when no other value is specified.
*/

public class Example {
    private int x; // Defaults to 0
    private double y; // Defaults to 0.0
    private boolean z; // Defaults to false
    private String s; // Defaults to null

    public Example() {
        // Default constructor
    }

    public void printValues() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("s: " + s);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.printValues();
    }
}