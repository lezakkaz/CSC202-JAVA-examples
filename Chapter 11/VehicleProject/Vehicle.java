public class Vehicle {
    String brandName;
    int yearOfProduction;
    int numberOfWheels;



    Vehicle(String brandName, int yearOfProduction, int numberOfWheels){
        this.brandName = brandName;
        this.numberOfWheels = numberOfWheels;
        this.yearOfProduction = yearOfProduction;
    }

    private void display(){
        System.out.println("This vehicle brand is " + brandName);
    }

}
