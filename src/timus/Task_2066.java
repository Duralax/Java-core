package timus;

import java.util.Scanner;

public class Task_2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min, middle, max, result;

        min = a;

        if (b < min){
            min = b;
        }
        if (c < min) {
            min = c;
        }

        max = a;

        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        middle = a + b + c - min - max;

        if (max == 0 || middle == 0 || max == 1 || middle == 1){
            result = min - (max + middle);
        } else {
            result = min - max * middle;
        }

        System.out.println(result);

        in.close();
    }
}
