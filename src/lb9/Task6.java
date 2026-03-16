package lb9;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Кружка");
        map.put(1, "Подушка");
        map.put(2, "Ручка");
        map.put(3, "Перо");
        map.put(4, "Одеяло");
        map.put(5, "Стакан");
        map.put(6, "Ложка");
        map.put(7, "Вилка");
        map.put(8, "Тарелка");
        map.put(9, "Кастрюля");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("ключ: " + entry.getKey() + " значение: " + entry.getValue());
        }
        System.out.println();
        System.out.println("Строки у которых ключ больше 5:");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getKey() > 5){
                System.out.println("ключ: " + entry.getKey() + " значение: " + entry.getValue());
            }
        }
        System.out.println();
        System.out.println("Строки у которых ключ 0:");
        if (map.containsKey(0)){
            int counter = 0;
            for (Map.Entry<Integer, String> entry : map.entrySet()){
                if (entry.getKey() == 0) {
                    if (counter > 0){
                        System.out.print(entry.getValue() + ", ");
                    }else {
                        System.out.print(entry.getValue());
                    }
                    counter++;

                }
            }
        }else {
            System.out.println("Строк с ключом 0 нет");
        }
        System.out.println();
        System.out.println("Перемножение ключей строк с длиной больше 5");
        int result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if (entry.getValue().length() > 5){
                result *= entry.getKey();
                System.out.println("Ключ: " + entry.getKey() + " строка: " + entry.getValue());
            }
        }
        System.out.println("Результат перемножения:" + result);

    }
}
