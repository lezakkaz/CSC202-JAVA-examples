/*
In this example, we first create a Date object called specificDate with a specific date and time (February 13, 2009, 23:31:30 UTC), using the constructor that takes a long value representing the number of milliseconds since the Unix epoch.

We then create another Date object called currentDate using the default constructor, which initializes the object with the current date and time.

Finally, we compare the two Date objects using the before, after, and equals methods, and output a message indicating whether the specific date is before, after, or the same as the current date. In this case, the output would be "The specific date is before the current date", since February 13, 2009 is before the current date and time.
*/

import java.util.Date;

public class Example {
    public static void main(String[] args) {
        // Creating a Date object with a specific date and time
        Date specificDate = new Date(1234567890000L);
        System.out.println("Specific date: " + specificDate);

        // Creating a Date object with the current date and time
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);

        // Comparing the two Date objects
        if (specificDate.before(currentDate)) {
            System.out.println("The specific date is before the current date");
        } else if (specificDate.after(currentDate)) {
            System.out.println("The specific date is after the current date");
        } else {
            System.out.println("The specific date is the same as the current date");
        }
    }
}
