package timus;

import java.util.Scanner;

//Когда Вова стал работать с программкой Сергея, ему быстро надоело заглядывать в справочник соответствия комбинаций букв и иероглифов за подсказкой. Помогите Сергею доработать свою программку, чтобы при вводе некоторой латинской буквы на экране автоматически отображалась подсказка, помогающая продолжить ее до корректного иероглифа.
//Исходные данные
//В первой строке находится количество иероглифов в справочнике Сергея N (1 ≤ N ≤ 1000). В следующих N строках содержатся последовательности латинских символов из справочника, соответствующие японским иероглифам, по одной последовательности в строке. Каждая такая последовательность состоит из двух строчных букв латинского алфавита. В следующей строке содержится введенная Вовой буква.
//Результат
//Выведите список иероглифов из справочника, которые начинаются на введенный Вовой символ, по одному в строке в любом порядке. Если таких иероглифов нет, то ничего выводить не надо.
//Пример
//исходные данные	результат
//6
//na
//no
//ni
//ki
//ka
//ku
//k
//ka
//ki
//ku

public class Timus_1545 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String[] text = new String[n];

        for (int i = 0; i < text.length; i ++){
            text[i] = in.next();
        }

        String letterInStr = in.next();
        char letterChar = letterInStr.charAt(0);

        int size = 0;

        for (int j = 0; j < text.length; j++){
            if (text[j].charAt(0) == letterChar){
                size++;
            }
        }

        String[] correctLines = new String[size];
        int indexOfLine = 0;

        for (int j = 0; j < text.length; j++){
            if (text[j].charAt(0) == letterChar){
                correctLines[indexOfLine] = text[j];
                indexOfLine++;
            }
        }

        for (String line : correctLines){
            System.out.println(line);
        }
        in.close();
    }
}
