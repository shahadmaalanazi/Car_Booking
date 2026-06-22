package finalproject_bookingcars;

public class HybridCar extends Car {

    //variables
    private double electricRange;
    private double gasolineTankCapacity;

    //constructor
    public HybridCar(double electricRange, double gasolineTankCapacity, String made,String model , int year, double price) {
        super(made,model , year, price);
        this.electricRange = electricRange;
        this.gasolineTankCapacity = gasolineTankCapacity;
    }

    public HybridCar() {
         super(null,null,0,0.0);
    }

    //getters
    public double getElectricRange() {
        return electricRange;
    }

    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    //setters
    public void setElectricRange(double electricRange) {
        this.electricRange = electricRange;
    }

    public void setGasolineTankCapacity(double gasolineTankCapacity) {
        this.gasolineTankCapacity = gasolineTankCapacity;
    }

    //methods
    @Override
    public double calculatePrice() {
        if (insurance() == true) {
            return (getPrice() + 1500);
        } else {
            return (getPrice() + 1000);
        }
    }

    @Override
    public boolean carAvailability() {
        if ("HONDAACCORD".equals(getModel()) || "TOYOTAPRIUS".equals(getModel())) {
            System.out.println("The car is Available");
            return true;
        } else {
            System.out.println("The car is Not Available");
            return false;
        }
    }

    @Override
    public String PrintInfo() {
        String s = super.toString() + ("The electric range is" + electricRange + " \nThe gasoline tank capacity is") + gasolineTankCapacity;
        return s;
    }

}
