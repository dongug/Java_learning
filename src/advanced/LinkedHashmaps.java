package advanced;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Cherry", 140);
        map.put("Apple", 10);
        map.put("Banana", 30);
        map.put("Orange", 20);

        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.values());

        //Сохраняет элементы в порядке их добавления
    }
}
