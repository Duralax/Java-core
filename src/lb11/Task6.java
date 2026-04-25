package lb11;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает
// новый список, содержащий только те числа, которые делятся на заданное число без остатка.

public class Task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер списка: ");
        int size = in.nextInt();
        List<Integer> nums = new ArrayList<>();

        System.out.println("Введите число для проверки деления: ");
        int checkNum = in.nextInt();

        Random random = new Random();

        System.out.println("\nМассив целых чисел: \n");
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(200));
            System.out.println(nums.get(i));
        }

        List<Integer> resultList = findDividingNums(nums, checkNum);

        System.out.println("\nЧисла которые делятся на " + checkNum + " без остатка: \n");
        for (Integer i : resultList){
            System.out.println(i);
        }
    }

    public static List<Integer> findDividingNums(List<Integer> list, int num){
        if (num == 0){
            System.out.println("Деление на 0 невозможно");
            return new ArrayList<>();
        }
        return list.stream().filter(a -> a % num == 0).collect(Collectors.toList());
    }
}
