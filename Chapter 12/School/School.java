import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {
    static Person[] school = new Person[20];
    static int numberOfStudents = 0;

    static void addPerson(Person person){
        school[numberOfStudents] = person;
        numberOfStudents++;
    }

    static void displayAllDetails(){
        for(int i=0; i < school.length;i++){
            if (school[i] == null){
                break;
            }
            System.out.println(school[i].getDetails());
        }
    }

    static void addFromCSV(String filePath){
        String csvSplitBy=",";

        try (Scanner scanner = new Scanner(new File(filePath))) {
            if (scanner.hasNextLine()) {
                String x = scanner.nextLine();
                System.out.println(x);
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] record = line.split(csvSplitBy);

                if (record[2].equals("Teacher")){
                    addPerson(new Teacher(record[0], Integer.valueOf(record[1]), record[4]));
                }else{
                    addPerson(new Student(record[0], Integer.valueOf(record[1]), record[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        addPerson(new Student("Ahmed", 23, "CS"));
        addPerson(new Teacher("Lamia", 31, "CSC202"));
        addPerson(new Student("Riad", 20, "CS"));
        addPerson(new Teacher("Omar", 35, "CSC202"));
        addFromCSV("C:/Users/khiati.zakaria/Desktop/data.csv");

        displayAllDetails();

    }
}