package timus;

import java.util.Scanner;

public class Timus_2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[]grades = new int[n];

        for (int i = 0; i < n; i++){
            grades[i] = in.nextInt();
        }

        boolean three = false;
        int sumOfFives = 0;
        int sumOfGrades = 0;

        for (int i : grades){
            if (i == 3){
                three = true;
                break;
            } else if (i == 5){
                sumOfFives += 1;
            }
            sumOfGrades += i;
        }

        double average = (double) sumOfGrades / n;

        if (three){
            System.out.println("None");
        }else if (sumOfFives == n){
            System.out.println("Named");
        }else if (average >= 4.5){
            System.out.println("High");
        } else {
            System.out.println("Common");
        }

    }
}
