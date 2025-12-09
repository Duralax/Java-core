package lb4;

import java.util.Scanner;

//Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите высоту прямоугольника: ");
        int height = in.nextInt();

        System.out.println("Введите ширину прямоугольника: ");
        int width = in.nextInt();

        int[][] rect_arr = new int[height][width];

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                rect_arr[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(rect_arr[i][j]);
            }
            System.out.print("\n");
        }
        in.close();
    }
}
