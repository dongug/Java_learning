package advanced;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Cherry");

//        Set<String> keys = map.keySet();
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Banana");
        set1.add("Cherry");

        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
        set2.add("Apple");
        set2.add("Orange");
        set2.add("Banana");
        set2.add("Cherry");

        System.out.println(set2);

    }
}
