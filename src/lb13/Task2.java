package lb13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

        System.out.println("Матрица:");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j ++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println("Введите номер столбца: ");
            int colNum = sc.nextInt();

            if (colNum > matrix[0].length || colNum < 1){
                throw new ArrayIndexOutOfBoundsException("Столбца с таким номером нет");
            }
            System.out.println("Столбец " + colNum + ":");
            for (int[] i: matrix){
                System.out.println(i[colNum-1]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Столбца с таким номером нет");
        } catch (InputMismatchException e){
            System.out.println("Значение должно быть int");
        }finally {
            sc.close();
        }

    }
}
