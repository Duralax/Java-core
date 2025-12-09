package lb4;


public class Example1 {
    public static void main(String[] args) {
        int figure = 10; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета кол-ва строк
        int j; // переменная задает число, необходимое для расчета кол-ва колонок (символов в строке)
        int z; // переменная необходима для вывода служебного сообщения о кол-ве символов в троке

        for (i = 1; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -5; j < figure; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в cтроке " + z);
        }

    }
}
