package finalproject_bookingcars;

import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.InputMismatchException;
import javafx.scene.paint.Color;

public class Test extends Application {

    static int z;
    static ArrayList<Car> in = new ArrayList<>();
    String s = "";

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));

        Text showInfo = new Text(" The Info about The Cars ");
        showInfo.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        showInfo.setFill(Color.CADETBLUE);

        grid.add(showInfo, 0, 0, 2, 1);

        TextArea tArea = new TextArea();
        tArea.setEditable(false);
        grid.add(tArea, 0, 1, 2, 1);

        Button btn = new Button(" Show Info ");
        grid.add(btn, 0, 2);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                ArrayList<Car> list = Test.in;

                for (Car car : list) {
                    s += car + "\n\n";
                
                }
                tArea.setText(s);
            }

        });
        Scene scene = new Scene(grid, 450, 450, Color.BLUEVIOLET);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Car Booking");
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    public static void main(String[] args) {
        String checkoutInfo = null;
        Person P2 = null;
        Person P1 = null;
        int age = 0;

        // scanner
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("\nFor Customers Enter   1\nFor Employee Enter    2");
            int x = input.nextInt();

            switch (x) {
                case 1: {
                    System.out.println("Enter your name ");
                    String name = input.next();
                    System.out.println("Enter your age ");
                    age = input.nextInt();
                    System.out.println("Enter your phone number ");
                    String phoneNum = input.next();
                    System.out.println("Enter your password ");
                    String password = input.next(); // polymorphism
                    P1 = new Customer(phoneNum, name, 11, age, password);

                    while (P1.Password() == false) {
                        System.out.println("Enter another password");
                        password = input.next();
                        P1.setPassword(password);
                    }
                    System.out.println(P1.PrintInfo());
                    break;
                }
                case 2: {
                    // Array
                    Person[] arr = new Person[2];
                    arr[0] = new Employee(4000.0, "", "ahmed", 201, 0, "11223344");
                    arr[1] = new Employee(4000.0, "", "lara", 202, 0, "A1234567");

                    System.out.println("Enter your name ");
                    String name = input.next();
                    System.out.println("Enter your age ");
                    age = input.nextInt();
                    System.out.println("Enter your job ");
                    String job = input.next();
                    System.out.println("Enter your password ");
                    String password = input.next();
                    // polymorphism
                    P2 = new Employee(4000, job, name, 21, age, password);
                    if (("ahmed".equals(P2.getName()) && !"11223344".equals(P2.getPassword()) ) || ("lara".equals(P2.getName()) && !"A1234567".equals(P2.getPassword()) )) {
                        System.out.println("WRONG !! Enter another password");
                        password = input.next();
                        P2.setPassword(password);
                    }
                    while (P2.Password() == false) {
                        System.out.println("Enter another password");
                        password = input.next();
                        P2.setPassword(password);
                    }
                    if ("manager".equals(job)) {
                        // down casting
                        Employee E = (Employee) P2;
                        E.setSalary(E.getSalary() + 1000);
                    }
                    System.out.println(P2.PrintInfo());

                }
                break;
            }

         
            in.add(new ElectricCar(100, "United States", "Tesla", 2024, 2500));
            in.add(new ElectricCar(150, "United States","Lucid" , 2023, 1600));
            in.add(new GasolineCar(200, "China","ChevroletSpark" , 2019, 1000));
            in.add(new GasolineCar(160, "United States","VolkswagenJetta" , 2021, 900));
            in.add(new HybridCar(50, 60,"Japan" , "HondaAccord", 2022, 3000));
            in.add(new HybridCar(70, 50,"Japan" , "ToyotaPrius", 2024, 3800));
            double Price = 0;
            int y = 0;

            while (age < 70 && age > 20 && y != 4 && y != 6 && y != 5) {
                System.out.println("Enter 1 to choose a car ");
                System.out.println("Enter 2 to check availability of car ");
                System.out.println("Enter 3 to checkout ");
                System.out.println("Enter 4 to save your info ");
                System.out.println("Enter 5 GUI ");
                System.out.println("Enter 6 to leave ");
                y = input.nextInt();
                switch (y) {
                    case 1: {

                        for (Car elm : in) {
                            System.out.print("CAR number: ");
                            System.out.println(in.indexOf(elm) + 1);

                            if (elm instanceof HybridCar) {
                                System.out.println(elm.PrintInfo());
                            }
                            if (elm instanceof GasolineCar) {
                                System.out.println(elm.PrintInfo());
                            }
                            if (elm instanceof ElectricCar) {
                                System.out.println(elm.PrintInfo());
                            }

                        }
                        System.out.println("Enter the car number:");
                        z = input.nextInt();
                        switch (z) {
                            case 1, 2: {
                                System.out.println("You choose an Electric car ");
                                Price = (in.get(z - 1).getPrice());
                                System.out.println(Price);
                                break;
                            }
                            case 3, 4: {
                                System.out.println("You choose a Gasoline car ");
                                Price = (in.get(z - 1).getPrice());
                                System.out.println(Price);
                                break;
                            }
                            case 5, 6: {
                                System.out.println("You choose a Hybrid car ");
                                Price = (in.get(z - 1).getPrice());
                                System.out.println(Price);
                                break;
                            }
                            default: {
                                System.out.println("Invalid option");
                                break;
                            }
                        }
                        break;
                    }
                    case 2: {

                        System.out.println("There is a:" + Car.getNumCar() + " Availabile");
                        for (Car elm : in) {
                            System.out.print("CAR ");
                            System.out.println(in.indexOf(elm) + 1);
                            System.out.println(elm.toString());
                        }
                        System.out.println("Enter the type of the car (Electric , Hybrid , Gasoline )");
                        String type = input.next();
                        System.out.println("Enter the model of the car");
                        String model = input.next();
                        if ("Electric".equals(type)) {
                            ElectricCar EC1 = new ElectricCar(0, model, "", 0, 0);
                            EC1.carAvailability();
                        }
                        if ("Hybrid".equals(type)) {
                            HybridCar HC1 = new HybridCar(0, 0, model, "", 0, 0);
                            HC1.carAvailability();
                        }
                        if ("Gasoline".equals(type)) {
                            GasolineCar GC1 = new GasolineCar(0, model, "", 0, 0);
                            GC1.carAvailability();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Set a pickup Date ");
                        Date D1 = new Date(0, 0, 0);
                        do {
                            System.out.println("Enter a Day : ");
                            int day = input.nextInt();
                            D1.setDay(day);
                            System.out.println("Enter a Month : ");
                            int month = input.nextInt();
                            D1.setMonth(month);
                            System.out.println("Enter a Year : ");
                            int year = input.nextInt();
                            D1.setYear(year);
                        } while (D1.checkDate() == false);
                        Checkout c1 = new Checkout(D1, new ADDRESS(), in);
                        checkoutInfo = c1.PrintInfo(z);
                        System.out.println(checkoutInfo);
                        break;
                    }
                    case 4: {
                        {
                            WriteTextFile w = new WriteTextFile();
                            w.openFile("SavingFile.txt");
                            if (checkoutInfo != null) {
                                w.Write_File(checkoutInfo);
                            }
                            if (P1 != null) {
                                w.Write_File(P1);
                            }
                            if (P2 != null) {
                                w.Write_File(P2);
                            }
                            w.Close_File();
                            ReadTextFile r = new ReadTextFile();
                            r.openFile("SavingFile.txt");
                            r.Read_File();
                            r.Close_File();
                            System.out.println("SUCCESSFULLY SAVED IN (SavingFile.txt)");
                            break;
                        }
                    }

                    case 5: {
                        launch(args);
                        break;
                    }
                    case 6: {

                        System.out.println(" GoodBye!");
                    }
                    break;

                    default: {
                        System.out.println("Invalid option");
                        break;
                    }
                }

            }
            if (age < 21) {
                System.out.println("You are Underage !");
            }
            if (age > 69) {
                System.out.println("You are not allowed!");
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input ");
            input.nextLine();
        } catch (Exception e) {
            System.err.println("Exception occurred:" + e.getMessage());
        }
        {
            input.close();
            System.out.println(" End of Program ...");
        }
    }
}
