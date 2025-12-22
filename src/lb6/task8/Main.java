package lb6.task8;

//8. Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
// а результатом возвращается среднее значение для элементов массива
// (сумма значений элементов, деленная на количество элементов в массиве).

public class Main {
    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5, 6};

        System.out.println("Массив intArray: ");

        for (int i : intArray1){
            System.out.print(i + " ");
        }

        System.out.printf("\nСреднее значение элементов данного массива = %.2f\n", calcArrayAverageValue(intArray1));

    }

    public static double calcArrayAverageValue(int[] intArray){
        if (intArray.length == 0) {
            return 0;
        }
        int sum = 0;

        double averageValue;

        for (int i : intArray) {
            sum += i;
        }

        averageValue = (double) sum / intArray.length;

        return averageValue;


    }
}
