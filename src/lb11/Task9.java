package lb11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//9.	Напишите функцию, которая принимает на вход список строк
// и возвращает новый список, содержащий только те строки, которые содержат
// только буквы (без цифр и символов).

public class Task9 {
    public static void main(String[] args) {
        String str = "Напишите123 функцию, которая принимает " +
                "на !вход! сп2исок строк и возвращает^& новый список, " +
                "содержащий только те строки, которые содержат только буквы (без цифр и символов).";
        List<String> strings = List.of(str.split(" "));

        System.out.println("\nПолный список строк: \n");
        for (String s : strings){
            System.out.println(s);
        }

        List<String> filteredStrings = onlyLettersInStr(strings);

        System.out.println("\nСписок строк, которые содержат только буквы: \n");
        for (String s : filteredStrings){
            System.out.println(s);
        }
    }

    public static List<String> onlyLettersInStr (List<String>list){
        return list.stream().filter(s -> s.matches("\\p{L}+")).collect(Collectors.toList());
    }
}
