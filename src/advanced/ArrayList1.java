package advanced;

import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        System.out.println(array);
        System.out.println(array.size());

        array.remove(5);
        System.out.println(array);
        System.out.println(array.size());
        //При уменьшении размера динамического массива его вместимость (10) не меняется. Если
        // добавить элемент к 10 существующим, то вместимость будет 15
    }
}
