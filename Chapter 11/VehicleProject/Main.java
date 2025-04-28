public class Main {
    public static void main(String[] args) {
        // Implicit casting, we are putting a Car object inside a Vehicle variable
        Vehicle a = new Car("Toyota", 2023, "U", "A1001");

        // Explicit casting, is when you turn a Vehicle object 
        // (that was orginally created a vehicle) into a Car object
        // Explisit casting of an object that is not a Car into a Car
        // will result into a ClassCastException error
        Car b = (Car) a;

      
        // Testing the equals method
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}
