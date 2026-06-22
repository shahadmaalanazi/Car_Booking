package finalproject_bookingcars;

public class Customer extends Person {

    //variables
    private String phonrNumber;

    //constructor

    public Customer() {
        super(null,0,0,null);
       
    }
    
    
    public Customer(String phonrNumber, String name, int id, int age, String password) {
        super(name, id, age, password);
        this.phonrNumber = phonrNumber;

    }

    

    //setter
    public void setPhonrNumber(String phonrNumber) {
        this.phonrNumber = phonrNumber;
    }

    //getter
    public String getPhonrNumber() {
        return phonrNumber;
    }

    //methods
    @Override
    public boolean Password() {
        if (getPassword().length() < 8) {
            System.out.println("You must enter 8 or more digits");
            return false;
        } else {
            return true;
        }

    }

    
    @Override
    public String PrintInfo() {
        return super.toString() + " \nphonrNumber: " + phonrNumber;
    }

}
