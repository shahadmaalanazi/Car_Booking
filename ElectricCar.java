
package finalproject_bookingcars;


public class ElectricCar extends Car {
    
    //variable
    private int batteryCapacity ;

    
    //constructor 
    public ElectricCar() {
        super(null,null,0,0.0);
    }
    public ElectricCar(int batteryCapacity, String made,String model , int year, double price) {
        super(made,model , year, price);
        this.batteryCapacity = batteryCapacity;
    }

   

 
    //getter
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    
    //setter
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    
    //methods
    

   @Override
     public double calculatePrice(){
     if ( insurance()==true ) {
         return (getPrice()+2500); }
     else {
         return (getPrice()+2000); }
     }



@Override
public boolean carAvailability() {
if ( "Lucid".equals(getModel()) || "Tesla".equals(getModel()) ) {
    System.out.println("The car is Available");
     return true ; }
else {
     System.out.println("The car is Not Available");
     return false ; }
}

   @Override
    public String PrintInfo() {
       String s=super.toString()+"\nThe battery capacity is "+batteryCapacity;
       return s;
    }




    
}