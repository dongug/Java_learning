package advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);
        map.put("Cherry", 140);

//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            entry.getValue();
//        }

        for (String key: map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.values());
//        Set<String> strings = map.keySet();

        //Сохраняет элементы рандомно, работает быстрее чем LinkedHashMap и TreeHashMap
    }
}
