package finalproject_bookingcars;

import java.util.ArrayList;

public class Checkout extends Carshowroom {

    // variables 
    private Date date;

    // constructors
    public Checkout(Date date, ADDRESS address, ArrayList<Car> in) {
        super(address, in);
        this.date = date;
    }

    public Checkout() {
        super(null,null);
       
    }

    // Getter and Setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {

        this.date = date;

    }

    // methods
    public String PrintInfo(int z) {
        String s = "\n" + date + "\n" + "The total price is: " + (getIn()[z - 1].calculatePrice() * Payable.Tax) + "\n" + DisplayShowroomInfo();
        return s;
    }

}
