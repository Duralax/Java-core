package lb13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива: ");

            int size = sc.nextInt();
            byte[] byteArr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Введите элемент byte: ");
                int value = sc.nextInt();
                if (value < -128 || value > 127) {
                    throw new RuntimeException("Элемент должен быть типа byte");
                }

                byteArr[i] = (byte) value;
            }
            int sum = 0;
            System.out.println("Массив byte: ");
            for (byte i : byteArr) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();
            if (sum < -128 || sum > 127) {
                throw new RuntimeException("Сумма должна быть типа byte");
            }
            System.out.println("Сумма элементов byte: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка введено не целое число");
        }catch (NegativeArraySizeException e){
            System.out.println("Размер массива должен быть положительным числом");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }finally {
            sc.close();
        }

    }
}
