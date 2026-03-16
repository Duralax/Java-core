package timus;

import java.util.Scanner;

public class Task_1881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        int pages = 1;
        int linesOnPage = 1;
        
        int currentLineLength = words[0].length();
        
        for (int i = 1; i < n; i++) {
            String word = words[i];
            
            if (currentLineLength + 1 + word.length() <= w) {
                currentLineLength += 1 + word.length();
            } else {
                linesOnPage++;
                if (linesOnPage > h) {
                    pages++;
                    linesOnPage = 1;
                }
                
                currentLineLength = word.length();
            }
        }
        System.out.println(pages);
        sc.close();
    }
}
