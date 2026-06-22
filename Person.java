package finalproject_bookingcars;

public abstract class Person implements Payable {

    //variables
    private String name;
    private int id;
    private int age;
    private String password;

    //constroctor
    public Person(String name, int id, int age, String password) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.password = password;
    }

    public Person() {
        this(null,0,0,null);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    //methods
    public abstract boolean Password();

    @Override
    public String toString() {
        return "\nname: " + name + "\nid: " + id + "\nage: " + age;
    }

}
