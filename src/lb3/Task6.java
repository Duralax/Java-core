package lb3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

//6. Напишите программу, в которой создается одномерный числовой массив и заполняется числами, которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее).
// Размер массива вводится пользователем. Предусмотреть обработку ошибки, связанной с вводом некорректного значения.

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arr_len = in.nextInt();

        if (arr_len > 0){
            int[] array = new int[arr_len];
            Random random = new Random();

            int rand_num;

            for (int i = 0; i < arr_len; i++){
                while (true){
                    rand_num = random.nextInt(1000);
                    if (rand_num % 5 == 2){
                        break;
                    }
                }
                array[i] = rand_num;
                System.out.println("Элемент массива ["+i+"] = "+ rand_num);
            }

            System.out.println("Получившийся массив: " + Arrays.toString(array));
        } else {
            System.out.println("Введено некорректное значение!");
        }

        in.close();
    }
}
