package lb6.task4;

//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа n (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа n. То есть n!! = n * (n - 2) * (n - 4)* ... (последний множитель равен 1 для
//нечетного n и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15

public class MyClass4 {

    public static void DoubleFactorial(int num){

        if (num >= 0) {
            System.out.print(num + "!!" +  " = ");

            int dbFactorial = 1;
            int num_iterator = num;

            while (num_iterator > 0) {
                dbFactorial *= num_iterator;
                num_iterator -= 2;
            }

            System.out.print(dbFactorial + "\n");

        } else {
            System.out.println("Значение не может быть меньше 0");
        }

    }
}
