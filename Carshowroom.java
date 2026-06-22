package finalproject_bookingcars;

import java.util.ArrayList;

public class Carshowroom {

    // variables 
    private ADDRESS address;
    private Car[] in;

// constructor
    public Carshowroom(ADDRESS address, ArrayList<Car> in) {
        this.address = address;
        this.in = new Car[in.size()];
        int index = 0;
        for (Car elem : in) {
            this.in[index++] = elem;
        }

    }

    public Carshowroom() {
        this(null,null);
    }
    

    // needed getters & setters
    public Car[] getIn() {
        return in;
    }

    public ADDRESS getAddress() {
        return address;
    }

    // methods
    public String DisplayShowroomInfo() {
        String s = address.toString() + "\n";
        return s;

    }

}
