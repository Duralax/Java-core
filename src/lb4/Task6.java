package lb4;

import java.util.Scanner;
import java.util.Random;

//6. Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите кол-во строк массива: ");
        int row = in.nextInt();

        System.out.println("Введите кол-во столбцов массива: ");
        int column = in.nextInt();

        System.out.println("\nПолучившийся массив: ");

        int[][] array = new int[row][column];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                array[i][j] = random.nextInt(99);
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        int del_row = random.nextInt(row);
        int del_col = random.nextInt(column);
        System.out.println();
        System.out.println("Удаляются строка: ["+del_row+"] и столбец: ["+del_col+"]");
        System.out.println();
        System.out.println("Массив без удаленных строки и столбца: ");
        int[][] del_array = new int[row-1][column-1];

        int del_array_row = 0;
        int del_array_column;

        for (int i = 0; i < row; i++){
            if (i == del_row){
                continue;
            }
            del_array_column = 0;
            for (int j = 0; j < column; j++){
                if (j == del_col){
                    continue;
                }
                del_array[del_array_row][del_array_column] = array[i][j];
                System.out.print(del_array[del_array_row][del_array_column] + " ");
                del_array_column++;
            }
            System.out.print("\n");
            del_array_row++;
        }
        in.close();
    }
}
