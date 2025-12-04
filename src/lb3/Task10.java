package lb3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//Напишите программу, в которой создается целочисленный массив,
// заполняется случайными числами и после этого значения элементов в массиве сортируются в порядке убывания значений.

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int arr_len = in.nextInt();

        int[] array = new int[arr_len];

        for (int i = 0; i < arr_len; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println("Получившийся массив: \n" + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Массив после сортировки в порядке возрастания значений: ");
        for (int j : array){
            System.out.print(j + " ");
        }
        System.out.println("\n\nМассив после сортировки в порядке убывания значений: ");
        for (int n = arr_len-1; n >= 0; n--){
            System.out.print(array[n] + " ");
        }
        in.close();
    }
}
