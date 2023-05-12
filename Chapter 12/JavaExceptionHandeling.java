import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static int ArithmeticExceptionExample (int x, int y) throws ArithmeticException{
        if (y==0){
            throw new ArithmeticException();
        }else{
            return x/y;
        }
    }

    static int NullPointerExceptionExample(String x) throws NullPointerException{
        if (x==null){
            throw new NullPointerException();
        }else{
            return x.length();
        }
    }

    static int ArrayIndexOutOfBoundsExceptionExample (int[] x, int index) throws ArrayIndexOutOfBoundsException{
        if (index >= x.length){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            return x[index];
        }
    }


    public static void main(String[] args) {

        /* Each of these examples catches a different type of exception that could occur during the execution of a program. 
        The catch block is used to define the exception type and provide a block of code that will be executed if that exception is thrown. */

        // ArithmeticException: This exception is thrown when an exceptional arithmetic condition has occurred. For example, dividing by zero.
        try{
            int result = ArithmeticExceptionExample(30, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        }

        // NullPointerException: This exception is thrown when an application attempts to use null in a case where an object is required.
        try {
            int result = NullPointerExceptionExample(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Null value found: " + e);
        }

        // ArrayIndexOutOfBoundsException: Thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
        try {
            int[] arr = new int[5];
            int result = ArrayIndexOutOfBoundsExceptionExample(arr, 7);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e);
        }


        // NumberFormatException: Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the string does not have the appropriate format.
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e);
        }


        // FileNotFoundException: This exception is thrown during a failed or interrupted I/O operations.
        try {
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}