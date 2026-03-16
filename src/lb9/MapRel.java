package lb9;

import java.util.HashMap;
import java.util.Map;

public class MapRel {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

        System.out.println("Ключ 2: " + map.get(2));
        System.out.println("Есть ключ 5? " + map.containsKey(5));
        System.out.println("Размер: " + map.size());
        System.out.println("Все ключи: " + map.keySet());
        System.out.println("Все значения: " + map.values());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        map.remove(2);
        System.out.println("После удаления: " + map);
    }
}
