package lb3;

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
