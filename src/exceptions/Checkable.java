package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checkable {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Smth");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("100%");
        }
    }
}
