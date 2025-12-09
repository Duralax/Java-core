package lb4;

import java.util.Scanner;

//(дополнительная задача). Напишите программу «Шифр Цезаря», в которой необходимо реализовать собственный алфавит, остальные условия идентичны задаче 8.

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String rus_up = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String rus_dn = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String eng_up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String eng_dn = "abcdefghijklmnopqrstuvwxyz";


        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования: ");
        int key = in.nextInt();

        char[] charsArray = value.toCharArray();
        char[] newCharsArray = new char[charsArray.length];

        String current_str;
        int current_key_ind, shifted_index_in_alph;


        for (int i = 0; i < charsArray.length; i++){
            if (rus_up.indexOf(charsArray[i]) != -1){
                current_str = rus_up;
            } else if (rus_dn.indexOf(charsArray[i]) != -1) {
                current_str = rus_dn;
            } else if (eng_up.indexOf(charsArray[i]) != -1) {
                current_str = eng_up;
            } else if (eng_dn.indexOf(charsArray[i]) != -1) {
                current_str = eng_dn;
            } else {
                newCharsArray[i] = charsArray[i];
                continue;
            }

            shifted_index_in_alph = current_str.indexOf(charsArray[i]) + key;

            current_key_ind = shifted_index_in_alph % current_str.length();

            if (current_key_ind < 0){
                current_key_ind += current_str.length();
            }

            newCharsArray[i] = current_str.charAt(current_key_ind);


        }
        String resultValue = new String(newCharsArray);
        System.out.println("Зашифрованная строка: " + resultValue + ", по ключу " + key + " ");

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer;
        do {
            answer = in.next();
            if (answer.equals("y")) {
                for (int i = 0; i < newCharsArray.length; i++){
                    if (rus_up.indexOf(newCharsArray[i]) != -1){
                        current_str = rus_up;
                    } else if (rus_dn.indexOf(newCharsArray[i]) != -1) {
                        current_str = rus_dn;
                    } else if (eng_up.indexOf(newCharsArray[i]) != -1) {
                        current_str = eng_up;
                    } else if (eng_dn.indexOf(newCharsArray[i]) != -1) {
                        current_str = eng_dn;
                    } else {
                        newCharsArray[i] = charsArray[i];
                        continue;
                    }

                    shifted_index_in_alph = current_str.indexOf(newCharsArray[i]) - key;

                    current_key_ind = shifted_index_in_alph % current_str.length();

                    if (current_key_ind < 0){
                        current_key_ind += current_str.length();
                    }

                    newCharsArray[i] = current_str.charAt(current_key_ind);

                }
                resultValue = new String(newCharsArray);
                System.out.println("Дешифрованная строка: " + resultValue + ", по ключу " + key + " ");

            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
            } else {
                System.out.println("Введите корректный ответ (y/n): ");
            }
        } while (!answer.equals("y") && !answer.equals("n"));

        in.close();
    }
}
