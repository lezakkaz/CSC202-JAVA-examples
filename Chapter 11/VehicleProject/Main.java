public class Main {
    public static void main(String[] args) {
        // Implicit casting, we are putting a Car object inside a Vehicle variable
        Vehicle c1 = new Car("Toyota", 2023, "U", "A1001");
        Vehicle c2 = new Car("Toyota", 2023, "U", "A1001");
        Vehicle c3 = new Car("Toyota", 2023, "U", "A1002");
        
        Vehicle m1 = new Motorcycle("Toyota", 2023, "U", "A1001");
        Vehicle m2 = new Motorcycle("Toyota", 2023, "U", "A1001");
        
        

        // Explicit casting, is when you turn a Vehicle object 
        // (that was orginally created a vehicle) into a Car object
        // Explisit casting of an object that is not a Car into a Car
        // will result into a ClassCastException error
        Car testA = (Car) c1; 
        
        // The next line causes an error because it is a motorcycle, not a car
        // Car testB = (Car) m1; 

      
        // Testing the equals method
        System.out.println(c1 == c2); // returns false because == operator only compares refrences
        System.out.println(c1.equals(c2)); // returns true because these 2 cars have the same plate number
        System.out.println(m1.equals(m2)); // returns false because the MotorCycle class does not have an equals method
        System.out.println(c1.equals(c3)); // returns false because plateNumber of c1 and c3 arent equal
        System.out.println(c1.equals(m1)); // returns false because m1 is not a car
    }
}
