public class Conditions {
    public static void main(String[] args) {
        int example = 15;

        if (example < 5) {
            example += 10;
        }   else if (example < 20) {
            example += 5;
        }   else {
            example -= 10;
        }

        System.out.println(example);
    }
}
