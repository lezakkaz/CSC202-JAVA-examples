public class Car extends Vehicle{
    int numberOfDoors;
    int numberOfSeats;
    String modelName;
    boolean SUV;
    String plateNumber;

    Car(String brandName, int yearOfProduction, String modelName, String plateNumber){
        super(brandName, yearOfProduction, 4);
        this.numberOfDoors = 5;
        this.modelName = modelName;
        this.SUV = false;
        this.numberOfSeats = 5;
        this.plateNumber = plateNumber;
    }

    Car(String brandName, int yearOfProduction, int numberOfDoors, boolean SUV, int numberOfSeats,  String modelName, String plateNumber){
        super(brandName, yearOfProduction, 4);
        this.numberOfDoors = numberOfDoors;
        this.modelName = modelName;
        this.SUV = SUV;
        this.numberOfSeats = numberOfSeats;
        this.plateNumber = plateNumber;
    }

    public void display(){
        System.out.println("This car's brand name is " + this.brandName);
    }

    //Override checks if we are actually modifying the Object class equals method
    // and we are not just overloading or creating a new method
    @Override
    public boolean equals(Object obj) {
        // First, check if the given object is an instance of Car
        // there is no need to continue, if to continue if it's not a car
        if (obj instanceof Car) {
            // Cast the object to Car so we can access Car-specific fields
            // We must do this. Otherwise obj.plateNumber will return an error
            // because an Object object does not have a plateNumber
            Car temp = (Car) obj;
            
            // Compare the plate numbers of both cars
            // If they are equal, we consider the two Car objects equal
            // We use equals method because plateNumber is a String
            if (this.plateNumber.equals(temp.plateNumber)) {
                return true; // Return true if plate numbers match
            }
        }
        // If the object is not a Car, or plate numbers do not match
        return false;
    }

}
