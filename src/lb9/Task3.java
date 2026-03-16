package lb9;

import java.util.Scanner;


public class Task3 {
    public static void arrInput(int[]array, int i){
        if (i < array.length) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите " + i + "-й элемент: ");
            array[i] = sc.nextInt();
            arrInput(array, i+1);
        }
    }

    public static void arrPrint(int[]array, int i){
        if (i < array.length) {
            System.out.print(array[i]  + " ");
            arrPrint(array, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = sc.nextInt();

        int[] numArr = new int[size];

        System.out.println();
        arrInput(numArr, 0);

        System.out.println("Получившийся массив:");
        arrPrint(numArr, 0);
    }

}
