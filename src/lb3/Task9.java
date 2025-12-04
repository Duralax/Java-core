package lb3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int arr_len = in.nextInt();

        int[] array = new int[arr_len];

        for (int i = 0; i < arr_len; i++){
            array[i] = random.nextInt(10);
        }

        System.out.println("Получившийся массив: " + Arrays.toString(array));

        int min = array[0];

        for (int j = 0; j < arr_len; j++){
            if (array[j] <= min){
                min = array[j];
            }
        }

        System.out.println("\nМинимальные значения массива: ");

        for (int n = 0; n < arr_len; n++){
            if (array[n] == min){
                System.out.print("Элемент: " + array[n] + " индекс: " + n + "\n");
            }
        }
        in.close();
    }
}
