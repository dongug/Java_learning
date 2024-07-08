public class loops {
    public static void main(String[] args) {
        //for
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(a);
            a++;
        }
        //while
        int b = 0;
        while (b < 5) {
            System.out.println(b);
            b++;
        }
        //foreach
        int[] array = new int[10];
        String[] strArray = new String[5];

        for (int number: array) {
            System.out.println(number);
        }

        for (String str : strArray) {
            System.out.println(str);
        }
        //continue and break
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //пропуск четных чисел
            }
            if (i > 7) {
                break;
            }
            System.out.println(i);
        }

    }

}
