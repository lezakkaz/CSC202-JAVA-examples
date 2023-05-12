/* 
In this example, we're using a StringBuilder to create a string that contains our CSV data. 
We then write this string to the file using PrintWriter. 
The end result is a new CSV file that contains the text we defined in our StringBuilder.

Please replace "input.csv" and "output.csv" with the actual path to your CSV file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteCSV {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("output.csv"));
            StringBuilder sb = new StringBuilder();

            sb.append("Name");
            sb.append(",");
            sb.append("Age");
            sb.append("\n");

            sb.append("John Doe");
            sb.append(",");
            sb.append("30");
            sb.append("\n");

            pw.write(sb.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
