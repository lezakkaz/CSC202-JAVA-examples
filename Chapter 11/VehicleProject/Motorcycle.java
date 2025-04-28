public class Motorcycle extends Vehicle{
    String modelName;

    String plateNumber;
    
    Motorcycle(String brandName, int yearOfProduction, String modelName, String plateNumber){
        super(brandName, yearOfProduction, 2);
        this.modelName = modelName;
        this.plateNumber = plateNumber;
    }

    public void display(){
        System.out.println("This motorcycle's brand name is " + this.brandName);
    }
}
