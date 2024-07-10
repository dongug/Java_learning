package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checkable2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile() throws FileNotFoundException{
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
    }
}
