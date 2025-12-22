package lb6.task5;

//Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел 1^2 + 2^2 + 3^2 + ... + n^2.
// Число n передается аргументом методу. Для проверки результата можно использовать формулу 1^2 + 2^2 +3^2+…+n^2= n * (n+1) * (2n + 1)/6 (в условии не умножается на n почему-то)

public class MyClass5 {

    public static void SqrtSum (int value){
        if (value > 0){
            int sum = 0;

            for (int i = 1; i <= value; i++) {
                sum += i * i;

            }
            System.out.println("Сумма квадратов натуральных первых " + value + " чисел = " + sum);

            int checkValue = value * (value + 1) * (2 * value + 1) / 6;

            System.out.println("Проверка по формуле n * (n + 1) * (2 * n + 1) / 6: " + sum + " = " + checkValue);
        } else {
            System.out.println(value + " число должно быть больше 1");
        }
    }
}
