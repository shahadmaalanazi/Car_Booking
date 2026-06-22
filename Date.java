package finalproject_bookingcars;

public class Date {

    // variables 
    private int year;
    private int month;
    private int day;

    //constructors
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date() {

        this(0, 0, 0);
    }

    //Getters and Setters
    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;

    }

    public int getMonth() {

        return month;

    }

    public void setMonth(int month) {

        this.month = month;

    }

    public int getDay() {

        return day;

    }

    public void setDay(int day) {

        this.day = day;

    }

    // methods
    @Override

    public String toString() {
        return "Pickup Date: " + year + " - " + month + " - " + day;

    }

    public boolean checkDate() {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            System.out.println("Invalid Date ");
            System.out.println("Try Again");
            return false;
        } else {

            return true;
        }
    }

}
