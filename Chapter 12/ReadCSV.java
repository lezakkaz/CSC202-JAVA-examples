// In this example, the Scanner reads the CSV file line by line and prints each line to the console.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) {
        try {
            File file = new File("input.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}