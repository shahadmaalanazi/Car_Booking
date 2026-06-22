package finalproject_bookingcars;

import java.util.Scanner;

public abstract class Car implements Payable {

    //variables
    private String model;
    private String made;
    private int year;
    private double price;
    private static int numCar;

    //constructor
    public Car(String made,String model , int year, double price) {
        this.made = made;
        this.model = model;
        this.year = year;
        this.price = price;
        numCar++;
    }

    public Car() {
        this(null,null,0,0.0);
    }

   

    public static int getNumCar() {
        return numCar;
    }


    public String getModel() {
        return model;
    }

    public String getMade() {
        return made;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //setters
    public void setMade(String made) {
        this.made = made;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //methods
    public abstract double calculatePrice();

    public abstract boolean carAvailability();

    public boolean insurance() {
        Scanner n = new Scanner(System.in);
        System.out.println("enter if you want an insurance (1 for yes , 0 for no)");
        int num = n.nextInt();

        if (num == 1) {
            return true;
        } else if (num == 0) {
            return false;
        } else {
            System.out.println("Invalid enter");
            return false;
        }

    }

    @Override
    public String toString() {
        return String.format("The car is made in %S\nThe model of the car is %S\nThe year of production is %d\nThe price of the car is %.2f\n", made,model , year, price);
    }

}
