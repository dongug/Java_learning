package advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);
        map.put("Cherry", 140);

        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.values());

        //Сортировка по алфавиту ключа
    }
}
