package advanced;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String> array = new LinkedList<>();
        array.add("Andrei");
        array.add("Alex");
        array.add("Sergei");

        System.out.println(array);

        array.add(1, "Irina");

        System.out.println(array);
        //
    }
}
