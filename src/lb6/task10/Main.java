package lb6.task10;

//10. Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов.
// Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.

public class Main {
    public static void main(String[] args) {
        int[] intArray = {232, 32, 1, 1000, 348, 2};

        System.out.println("Текущий массив: ");

        for (int i : intArray){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] MinAndMax = getMinAndMax(intArray);

        System.out.println("\nМинимальное значение данного массива: " + MinAndMax[0]);
        System.out.println("Максимальное значение данного массива: " + MinAndMax[1]);

    }

    public static int[] getMinAndMax(int... nums){

        int[] minMaxArray = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        minMaxArray[0] = nums[0];
        minMaxArray[1] = nums[nums.length-1];

        return minMaxArray;
    }
}
