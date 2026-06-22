package finalproject_bookingcars;

public class GasolineCar extends Car {

    //variable
    private int fuelCapacity;

    //constructor
    public GasolineCar(int fuelCapacity,String made ,String model   , int year, double price) {
       super(made,model , year, price);
        this.fuelCapacity = fuelCapacity;
    }

    public GasolineCar() {
        super(null,null,0,0.0);
    }

    //getter
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    //setter
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    //methods
    @Override
    public double calculatePrice() {
        if (insurance() == true) {
            return (getPrice() + 500);
        } else {
            return (getPrice());
        }
    }

    @Override
    public boolean carAvailability() {
        if ("ChevroletSpark".equals(getModel()) || "VolkswagenJetta".equals(getModel())) {
            System.out.println("The car is Available");
            return true;
        } else {
            System.out.println("The car is Not Available");
            return false;
        }
    }

    @Override
    public String PrintInfo() {
        String s = super.toString() + "\nThe fuel capacity is " + fuelCapacity;
        return s;
    }

}
