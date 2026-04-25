package lb11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.stream.Collectors;

//8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
// содержащий только те числа, которые больше заданного значения.

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер списка: ");
        int size = in.nextInt();

        System.out.println("\nСписок целых чисел: \n");
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++){
            nums.add(random.nextInt(100));
            System.out.println(nums.get(i));
        }

        System.out.println("\nВведите число: ");
        int checkNum = in.nextInt();

        List<Integer> resultNums = biggerThan(nums, checkNum);

        System.out.println("\nСписок чисел больше " + checkNum + ": \n");
        for (Integer a : resultNums){
            System.out.println(a);
        }

    }
    public static List<Integer> biggerThan(List<Integer> nums, int num){
        return nums.stream().filter(x -> x > num).collect(Collectors.toList());
    }
}
