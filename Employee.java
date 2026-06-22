package finalproject_bookingcars;

public class Employee extends Person {

    //variables
    private double Salary;
    private String Job;

    //constroctor 
    public Employee(double Salary, String Job, String name, int id, int age, String password) {
        super(name, id, age, password);
        this.Salary = Salary;
        this.Job = Job;
    }

    public Employee() {
        super(null,0,0,null);
       
    }

    
    

    //setter
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    //getter
    public double getSalary() {
        return Salary;
    }

    public String getJob() {
        return Job;
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
        return super.toString() + "\nSalary: " + Salary + "\nJob: " + Job;
    }

}
