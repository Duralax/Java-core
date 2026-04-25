package lb11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> strings = List.of(str.split(" "));

        System.out.println("\nСписок всех строк: \n");

        for (String s : strings){
            System.out.println(s);
        }

        System.out.println("\nВведите минимальную длину строк: ");
        int lengthStrs = in.nextInt();

        List<String> resultStrs = strsWithLength(strings, lengthStrs);

        System.out.println("\nВсе строки с длиной больше " + lengthStrs + ": \n");

        for (String s : resultStrs){
            System.out.println(s);
        }
        in.close();
    }

    public static List<String> strsWithLength(List<String> strs, int size){
        return strs.stream().filter(s -> s.length() > size).collect(Collectors.toList());
    }
}
