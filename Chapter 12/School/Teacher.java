public class Teacher extends Person{

    private String subject;


    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    String getDetails(){
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Occupation: Teacher, Subject: " + this.subject;
    }



}
