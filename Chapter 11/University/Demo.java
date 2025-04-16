public class Demo {
    public static void main(String[] args) {
        Student x = new Student("Ahmed", 10001, 04,04,1999, 4.0);
        x.addCourse("CSC202");
        x.addCourse("CSC310");
        x.setGPA(3.8);
        System.out.println(x.getName());
        System.out.println(x.getBirthday().toString());
        System.out.println(x.getGPA());

    }


}
