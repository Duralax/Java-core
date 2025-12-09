package lb4;

import java.util.Scanner;

//Напишите программу, которая выводит в консольное окно прямоугольный треугольник;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите высоту треугольника: ");
        int height = in.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++){
                System.out.print('#');
            }
            System.out.print('\n');
        }
        in.close();
    }
}
