import java.io.IOException;

class Test {

    // Method that throws different exceptions based on the input value
    static boolean someMethod(int i) throws ArithmeticException, IOException, IllegalArgumentException {
        System.out.println("2. Inside of the method (Before the error)");

        // Throw different exceptions based on the value of i
        if (i == 0)
            throw new ArithmeticException();
        else if (i == 1)
            throw new IOException();
        else if (i == 2)
            throw new IllegalArgumentException();

        // This line is not reached if any of the above exceptions are thrown
        System.out.println("3. Inside of the method (After the error)");
        return true;
    }

}


public class MultipleExceptionsTest {
    public static void main(String[] args){

        try {
            // Before calling the method
            System.out.println("1. Statements before calling the method");

            // Call the method which may throw an exception
            Test.someMethod(1);

            // This line is not executed if an exception is thrown
            System.out.println("4. Statements after calling the method");
        } catch (ArithmeticException x1) {
            // Handle ArithmeticException
            System.out.println("5. ArithmeticException");
        } catch (IOException x2) {
            // Handle IOException
            System.out.println("6. IOException");
        } catch (IllegalArgumentException x3) {
            // Handle IllegalArgumentException
            System.out.println("7. IllegalArgumentException");
        } finally {
            // This block is always executed
            System.out.println("8. Finally statement");
        }

        // This line is executed after the try-catch-finally block
        System.out.println("9. Other statements");
    }
}

// Here's a brief explanation of the flow:
// The main method prints "1. Statements before calling the method".
// The someMethod is called with i = 1.
// Inside someMethod, it prints "2. Inside of the method (Before the error)".
// Since i == 1, it throws an IOException.
// The control goes to the catch block for IOException and prints "6. IOException".
// The finally block executes and prints "8. Finally statement".
// The main method continues and prints "9. Other statements".
