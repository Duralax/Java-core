package lb4;

import java.util.Scanner;
import java.util.Random;

// Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами. Затем в этом массиве строки и столбцы меняются местами:
// первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк и 3 столбцов.


public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите кол-во строк массива: ");
        int row = in.nextInt();

        System.out.println("Введите кол-во столбцов массива: ");
        int column = in.nextInt();

        int[][] array = new int[row][column];

        System.out.println("\nПолучившийся исходный массив: ");

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Массив с измененными местами строками и столбцами: ");

        int[][] rev_arr = new int[column][row];

        for (int i = 0; i < column; i++){
            for (int j = 0; j < row; j++) {
                rev_arr[i][j] = array[j][i];
                System.out.print(rev_arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        in.close();

    }
}
