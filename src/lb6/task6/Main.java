package lb6.task6;

//Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число.
// Результатом метод возвращает ссылку на новый массив, который получается из исходного массива (переданного первым аргументом методу),
// если в нем взять несколько начальных элементов. Количество элементов, которые нужно взять из исходного массива, определяются вторым аргументом метода.
// Если второй аргумент метода больше длины массива, переданного первым аргументом, то методом создается копия исходного массива и возвращается ссылка на эту копию.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = {2, 12, 60};

        System.out.println("Массив: " + Arrays.toString(arrayInt));

        int[] arrayIntResult1 = makeArray(arrayInt, 2);
        System.out.println("Для value 2: " + Arrays.toString(arrayIntResult1));

        int[] arrayIntResult2 = makeArray(arrayInt, 7);
        System.out.println("Для value 7: " + Arrays.toString(arrayIntResult2));

    }

    public static int[] makeArray(int[] arrayInt, int value){
        if (value >= arrayInt.length){
            return arrayInt;
        }

        int [] arrayIntResult = new int[value];

        for (int i = 0; i < value; i++){
            arrayIntResult[i] = arrayInt[i];
        }

        return arrayIntResult;
    }
}
