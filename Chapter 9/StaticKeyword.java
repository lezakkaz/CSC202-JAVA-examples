/*
In this example, we declare a static variable called count using the private static keywords. This variable is associated with the class as a whole, rather than with individual objects of the class. We initialize the variable to 0 by default.

We also declare a static method called incrementCount using the public static keywords. This method is associated with the class as a whole, rather than with individual objects of the class. It increments the value of the count variable by 1.

In the main method, we call the incrementCount method twice to increment the value of the count variable by 2.

Finally, we print the value of the count variable to the console using the println method.

When you run this code, it should output the following:

Count: 2

This is the value of the static variable count after we've incremented it twice using the incrementCount method.
*/

public class Example {
    // Declaring a static variable
    private static int count = 0;

    // Declaring a static method
    public static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        // Calling the static method
        incrementCount();
        incrementCount();

        // Printing the value of the static variable to the console
        System.out.println("Count: " + count);
    }
}
