package lb3;

//8. Напишите программу, в которой создается символьный массив из 10 элементов. Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные
// (то есть гласные буквы ’ А',1Е' и ' I' при присваивании значений элементам массива нужно пропустить). О
// тобразите содержимое созданного массива в консольном окне.

public class Task8 {
    public static void main(String[] args) {

        int size = 10;
        int letters_amount = 0;
        char start_char = 'A';

        char[] array = new char[size];

        while (letters_amount < size){
            if (start_char != 'A' && start_char != 'E' && start_char != 'I'){
                array[letters_amount] = start_char;
                letters_amount++;
            }
            start_char++;
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
