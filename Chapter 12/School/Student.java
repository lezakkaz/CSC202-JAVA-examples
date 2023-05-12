public class Student extends Person{
    private String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    String getDetails(){
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Occupation: Student, Major: " + this.major;
    }



//    Student(String name; int Age; String major){
//        super(name, age);
//        this.major = major;
//    }
}
