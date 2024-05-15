class Vehicle {
    String model_name;
    int horsepower;
    String color;

    // Constructor to initialize horsepower and color
    public Vehicle(String model_name, int horsepower, String color) {
        this.horsepower = horsepower;
        this.color = color;
    }

    // Override the equals method to compare Vehicle objects
    @Override
    public boolean equals(Object obj) {
        // Check if the obj is an instance of Vehicle
        // if it is not a vehicle we simply return false
        if (obj instanceof Vehicle) {
            // Explicitly cast obj to Vehicle to compare attributes because in the main class, 
            // the objects are being implictly casted to the Object class 
            // class when the method was invoked we cast it back to a vehicle (if it is in fact a vehicle)
            Vehicle other = (Vehicle) obj;
            // Compare horsepower and color
            if (this.horsepower == other.horsepower && this.color.equals(other.color)){
                return true;
            }
        }
        // Return false if obj is not an instance of Vehicle
        return false;
    }
}

public class OverrideEqualsExample{
    public static void main(String[] args) {
        // Create different Vehicle objects
        Vehicle car1 = new Vehicle(150, "Red");
        Vehicle car2 = new Vehicle(150, "Red");
        Vehicle car3 = new Vehicle(200, "Blue");
        Vehicle car4 = new Vehicle(150, "Blue");
        Vehicle bike = new Vehicle(100, "Red");

        // Example 1: Compare car1 and car2 (same horsepower and color)
        System.out.println("car1 equals car2: " + car1.equals(car2)); // Output: true

        // Example 2: Compare car1 and car3 (different horsepower and color)
        System.out.println("car1 equals car3: " + car1.equals(car3)); // Output: false

        // Example 3: Compare car1 and car4 (same horsepower, different color)
        System.out.println("car1 equals car4: " + car1.equals(car4)); // Output: false

        // Example 4: Compare car1 and bike (different horsepower and same color)
        System.out.println("car1 equals bike: " + car1.equals(bike)); // Output: false

        // Example 5: Compare car1 with null
        System.out.println("car1 equals null: " + car1.equals(null)); // Output: false

        // Example 6: Compare car1 with an object of another class
        String notAVehicle = "Not a Vehicle";
        System.out.println("car1 equals notAVehicle: " + car1.equals(notAVehicle)); // Output: false
    }
}
