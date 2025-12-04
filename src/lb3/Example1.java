package lb3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        //Создание объекта класса Scanner для считывания введенного числа в консоль
        Scanner id = new Scanner(System.in);
        //Сообщение пользователю
        System.out.println("Введите размер массива: ");
        //Запись в переменную Size - для размера массива
        int size = id.nextInt();
        //Значение введенное в консоль
        System.out.println("Размер массива равен " + size);
        // Создание массива с размером введенным из консоли
        int[] nums = new int[size];
        //Создание объекта класса Random для генерации "случайного" числа
        Random random = new Random();

        for (int i =0; i < nums.length; i++){
            //Присвоение i-ному элементу массива случайного значения
            nums[i] = random.nextInt(200);
            //Сообщение пользователю
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }
        //Сортировка массива по возрастанию его элементов
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++){
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
        id.close();
    }
}
