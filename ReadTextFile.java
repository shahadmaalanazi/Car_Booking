package finalproject_bookingcars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ReadTextFile {

    private Scanner input;

    public void openFile(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
        }
    }

    public void Read_File() {
        try {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (NoSuchElementException ex) {
            System.err.println("File improperly formed.");
            input.close();
        } catch (IllegalStateException ex) {
            System.err.println("Error reading from file.");
        }
    }

    public void Close_File() {
        if (input != null) {
            input.close();
        }
    }
}
