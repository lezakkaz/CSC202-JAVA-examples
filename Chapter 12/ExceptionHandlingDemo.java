import java.io.IOException;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        System.out.println("Before try block");
        try {
            methodThatThrows(5); // Change this value to 1, 2, or 3 to test different paths
            System.out.println("In the middle of try block");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("After try-catch-finally");
    }

    static void methodThatThrows(int input) throws ArithmeticException, NullPointerException, IOException {
        System.out.println("Inside methodThatThrows");

        if (input == 1) {
            throw new ArithmeticException("Divide by zero simulation");
        } else if (input == 2) {
            throw new NullPointerException("Null value simulation");
        } else if (input == 3) {
            throw new IOException("File not found simulation");
        } else if (input == 4) {
            throw new IllegalArgumentException("Wrong input");    
        } else {
            System.out.println("No exception thrown");
        }
    }
}
