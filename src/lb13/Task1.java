package lb13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Размер массива: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            for (int i = 0; i < size; i++){
                System.out.println("Элемент " + i + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.println("Массив:");
            int sum = 0;
            int elemCounter = 0;
            for (int i : arr){
                System.out.print(i + " ");
                if (i > 0){
                    sum += i;
                    elemCounter++;
                }
            }
            System.out.println();

            if (elemCounter == 0){
                throw new RuntimeException("Нет положительных элементов");
            }

            double average = (double) sum / elemCounter;
            System.out.println("Среднее значение положительных элементов: " + average);

        }catch (InputMismatchException e){
            System.out.println("Значение должно быть int");
        } catch (NegativeArraySizeException e){
            System.out.println("Размер массива должен быть положительным числом");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
