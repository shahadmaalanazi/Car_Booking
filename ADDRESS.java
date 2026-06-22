package finalproject_bookingcars;

public final class ADDRESS {

    //variables
    private final String street;
    private final String city;
    private final String ZipCode;

    // constructor
    public ADDRESS() {
        this.street = "AlQadsiah";
        this.city = "Riyadh";
        this.ZipCode = "13261";
    }
    
    // getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return ZipCode;
    }

    // methods
    @Override
    public String toString() {
        return "Pickup location:\nstreet: " + street + ", city: " + city + ", ZipCode: " + ZipCode;
    }

}
