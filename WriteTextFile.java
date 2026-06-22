package finalproject_bookingcars;

import java.io.*;
import java.util.*;

class WriteTextFile {

    private Formatter output;

    public void openFile(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.err.println("You do not have write access to this file.");
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
        }
    }

    public void Write_File(String checkoutInfo) {
        try {
            output.format("%s%n", checkoutInfo);

        } catch (FormatterClosedException ex) {
            System.err.println("Error writing to file");
        }
    }

    public void Write_File(Person E1) {
        try {
            output.format("%s%n", E1.toString());

        } catch (FormatterClosedException ex) {
            System.err.println("Error writing to file");
        }
    }

    public void Close_File() {
        if (output != null) {
            output.close();
        }
    }
}
