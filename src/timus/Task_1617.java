package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Integer> diameterCount = new HashMap<>();

        int counterInMap;

        for (int i = 0; i < n; i++) {
            int diameter = sc.nextInt();
            counterInMap = diameterCount.getOrDefault(diameter, 0);
            diameterCount.put(diameter, counterInMap + 1);
        }

        int amount = 0;
        for (int count : diameterCount.values()) {
            amount += count / 4;
        }

        // Выводим результат
        System.out.println(amount);

        sc.close();
    }
}
