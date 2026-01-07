package timus;

import java.util.Scanner;

public class Timus_1496 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOfAmount = in.nextInt();

        String[] allSubmits = new String[numOfAmount];

        for (int i = 0; i < allSubmits.length; i++){
            allSubmits[i] = in.next();
        }

        for (int i = 0; i < allSubmits.length; i++) {

            boolean firstElemInArray = true;

            for (int k = 0; k < i; k++) {
                if (allSubmits[i].equals(allSubmits[k])) {
                    firstElemInArray = false;
                    break;
                }
            }

            if (!firstElemInArray) {
                continue;
            }

            int repeatAmount = 0;

            for (int j = 0; j < allSubmits.length; j++) {
                if (allSubmits[i].equals(allSubmits[j])) {
                    repeatAmount++;
                }
            }

            if (repeatAmount > 1) {
                System.out.println(allSubmits[i]);
            }
        }
        in.close();
    }
}
