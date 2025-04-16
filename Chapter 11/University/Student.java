import java.util.ArrayList;
import java.util.Date;

public class Student extends Person{

    private double GPA;
    ArrayList<String> courses;

    public Student(String name, int id, int day, int month, int year, double GPA){
        super(name, id, new Date(day, month, year));
        this.GPA = GPA;
        this.courses = new ArrayList<>();
    }

    public double getGPA(){
        return this.GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public void addCourse(String course){
        this.courses.add(course);
    }
}
