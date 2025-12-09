package lb4;

import java.util.Scanner;

//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
// Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение: «Введите текст для шифрования»,
// после ввода текста, появляется сообщение: «Введите ключ». После того как введены все данные,
// необходимо вывести преобразованную строку с сообщением «Текст после преобразования: ».
// Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
// если пользователь вводит «y», тогда выполнить обратное преобразование.
// Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
// Если пользователь вводит что-то другое, отличное от «y» или «n», то программа ему выводит сообщение: «Введите корректный ответ».

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования: ");
        int key = in.nextInt();

        char[] charsArray = value.toCharArray();
        int[] ints = new int[charsArray.length];
        char[] newCharsArray = new char[charsArray.length];
        for (int i = 0; i < charsArray.length; i++) {
            ints[i] = charsArray[i] + key;
            newCharsArray[i] = (char) ints[i];
        }
        String resultValue = new String(newCharsArray);
        System.out.println("Зашифрованная строка: " + resultValue + ", по ключу " + key + " ");

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer;

        do {
            answer = in.next();
            if (answer.equals("y")) {
                for (int i = 0; i < charsArray.length; i++) {
                    ints[i] = newCharsArray[i] - key;
                    newCharsArray[i] = (char) ints[i];
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
