package exceptions;

public class Errors {
    public static void main(String[] args) {
        int i = 1;
        stackOverflowGenerator(i);
    }

    public static int stackOverflowGenerator(int i) {
        return stackOverflowGenerator(i);
    }
}
