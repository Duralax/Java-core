package lb11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

//5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат заданную подстроку.

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str1 = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.";

        List<String> strings = List.of(str1.split(" "));

        System.out.println("\nСтрока после сплитирования: \n");
        for (String a : strings){
            System.out.println(a);
        }

        System.out.println("\nВведите подстроку для поиска: ");
        String findStr = in.next();

        List<String> stringsWithSubStr = findSubStr(strings, findStr);

        System.out.println("\n" + "Строки, которые содержат подстроку \"" + findStr + "\": " + "\n");

        for (String e : stringsWithSubStr){
            System.out.println(e);
        }

    }
    public static List<String> findSubStr(List<String> strs, String subStr){
        return strs.stream()
                .filter(s -> s.contains(subStr))
                .collect(Collectors.toList());
    }
}
