package lb11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Введите размер списка: ");
        int size = in.nextInt();

        List<Integer> nums = new ArrayList<>();

        System.out.println("\nПолный список чисел: \n");
        for (int i = 0; i < size; i++){
            nums.add(random.nextInt(1000));
            System.out.println(nums.get(i));
        }

        System.out.println("\nВведите число: ");
        int checkNum = in.nextInt();

        List<Integer> resultList = smallerThan(nums, checkNum);

        System.out.println("\nСписок чисел, которые меньше числа " + checkNum + ": \n");
        for (Integer a : resultList){
            System.out.println(a);
        }

    }
    public static List<Integer> smallerThan(List<Integer> list, int num){
        return list.stream().filter(a -> a < num).collect(Collectors.toList());
    }
}
