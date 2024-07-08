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

        int a = 2;

        switch (a) {
            case 1 -> System.out.println(1);
            default -> System.out.println(100);
        }


        String s = switch (a) {
            case 2 -> "Two";
            default -> "Default";
        };

        int age = 17;

        String info = age >= 18 ? "adult" : "teen";

        System.out.println(info);

        System.out.println(s);

    }
}
