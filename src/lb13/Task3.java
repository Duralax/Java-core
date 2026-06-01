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
            try{
                for (int i = 0; i < size; i++) {
                    System.out.println("Введите элемент byte: ");
                    byte value = sc.nextByte();
                    byteArr[i] = value;
                }
            }catch (InputMismatchException e){
                throw new RuntimeException("Элемент должен быть типа byte");
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
            System.out.println("Ошибка размер массива должен быть int");
        }catch (NegativeArraySizeException e){
            System.out.println("Размер массива должен быть положительным числом");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }finally {
            sc.close();
        }

    }
}
