package lb4;

import java.util.Random;

//Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо), затем последний столбец (сверху вниз),
// вторая строка (справа налево) и так далее, как показано на рисунке

public class Task7 {
    public static void main(String[] args) {

        Random random = new Random();

        int row = 9;
        int col = 9;

        int[][] array = new int[row][col];

        System.out.println("Заполнение массива 9 х 9 змейкой по строкам: ");

        for (int i = 0; i < row; i++){
            if (i % 2 == 0){
                for (int j = 0; j < col; j++){
                    array[i][j] = random.nextInt(30);
                    System.out.print(array[i][j] + " ");
                }
            }else {
                for (int j = col-1; j >= 0; j--){
                    array[i][j] = random.nextInt(30);
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\nВывод получившегося массива: ");
        for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    System.out.print(array[i][j] + " ");
                }
            System.out.print("\n");
        }

    }
}
