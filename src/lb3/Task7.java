package lb3;

//Напишите программу, в которой создается одномерный символьный массив из 10 элементов. Массив заполняется буквами «через одну»,
// начиная с буквы ' а ': то есть массив заполняется буквами 'а', 'с', ' е', 'д' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке. Размер массива задается переменной.

public class Task7 {
    public static void main(String[] args) {
        int size = 10;

        char start_char = 'a';

        char[] array = new char[size];

        for (int i = 0; i < size; i++){
            array[i] = start_char;
            start_char += 2;
        }

        System.out.println("Массив в прямом порядке: ");
        for (int j = 0; j < size; j++){
            System.out.print(array[j] + " ");
        }

        System.out.println("\nМассив в обратном порядке: ");
        for (int n = size-1; n >= 0; n--){
            System.out.print(array[n] + " ");
        }

    }
}
