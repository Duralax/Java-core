package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Timus_1601 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "";

        text += in.nextLine();

        String[] strs = text.split("\n");
        System.out.println(Arrays.toString(strs));
        boolean separatorFlag = text.contains("\n");

        String resultText = "";
        System.out.println();
        for (int i = 0; i < strs.length; i++){
            strs[i] = strs[i].toLowerCase();
            String firstLetterLower = String.valueOf(strs[i].charAt(0));
            String firstLetterUpper = String.valueOf(strs[i].charAt(0)).toUpperCase();
            strs[i] = strs[i].replaceFirst(firstLetterLower, firstLetterUpper);
            System.out.println(strs[i]);
        }
    }
}
