/*
In this example, we first create a Random object using the default constructor, which initializes the object with a seed value based on the current time.

We then use the nextInt method to generate a random integer between 0 and 99, and output the result to the console.

We also use the nextDouble method to generate a random double between 0.0 and 1.0, and the nextBoolean method to generate a random boolean. We output the results of these methods to the console as well.

Note that the nextInt method takes an argument that specifies the upper bound (exclusive) of the range of integers to generate. In this case, we pass in 100 to generate a random integer between 0 and 99.

Similarly, the nextDouble method generates a random double between 0.0 (inclusive) and 1.0 (exclusive).

When we run this code, we should see output similar to the following:4
Random integer: 17
Random double: 0.9811453140351874
Random boolean: true
*/

import java.util.Random;

public class Example {
    public static void main(String[] args) {
        // Creating a Random object
        Random random = new Random();

        // Generating a random integer between 0 and 99
        int randomInt = random.nextInt(100);
        System.out.println("Random integer: " + randomInt);

        // Generating a random double between 0.0 and 1.0
        double randomDouble = random.nextDouble();
        System.out.println("Random double: " + randomDouble);

        // Generating a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}
