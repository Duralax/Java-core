package timus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] charArr = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for (char c : charArr) {
            if (!list.isEmpty() && list.get(list.size() - 1) == c){
                list.remove(list.size() - 1);
            } else {
                list.add(c);
            }
        }
        for (char c : list) {
            System.out.print(c);
        }

        sc.close();
    }
}
