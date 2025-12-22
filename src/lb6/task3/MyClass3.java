package lb6.task3;

import java.util.Arrays;

//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.

public class MyClass3 {

    public static void MinFinder(int... ints){
        System.out.println("Переданный массив: " + Arrays.toString(ints));

        if (ints.length != 0) {
            int min = ints[0];

            for (int anInt : ints) {
                if (anInt < min) {
                    min = anInt;
                }
            }

            System.out.println("Минимальное значение переданного массива: " + min);
        } else {
            System.out.println("Пустой массив");
        }

    }

    public static void MaxFinder(int... ints){
        System.out.println("Переданный массив: " + Arrays.toString(ints));

        if (ints.length != 0) {
            int max = ints[0];

            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }

            System.out.println("Максимальное значение переданного массива: " + max);
        }else {
            System.out.println("Пустой массив");
        }

    }

    public static void AverageFinder(int... ints){
        System.out.println("Переданный массив: " + Arrays.toString(ints));
        if (ints.length != 0) {
            int sum = 0;
            double averageValue;

            for (int anInt : ints) {
                sum += anInt;
            }

            averageValue = (double) sum / ints.length;

            System.out.printf("Среднее значение переданного массива: %.2f \n", averageValue);
        }else {
            System.out.println("Пустой массив");
        }
    }

}
