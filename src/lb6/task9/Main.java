package lb6.task9;

//9. Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
// В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним и так далее.

public class Main {
    public static void main(String[] args) {
        char[] charsArray = {'a', 'd', 'c', 'k', 'm', 'l'};

        System.out.println("Массив до перестановки: ");

        for (char i : charsArray){
            System.out.print(i + " ");
        }

        System.out.println("\nЭтот же массив, но после перестановки: ");

        reverseCharArray(charsArray);

        for (char j : charsArray){
            System.out.print(j + " ");
        }

    }
    public static void reverseCharArray(char[] charArray){
        if (charArray.length == 0){
            return;
        }

        for (int i = 0; i < charArray.length / 2; i++){
            int opositeSymbolIndex = charArray.length - i - 1;

            char tempValue = charArray[i];

            charArray[i] = charArray[opositeSymbolIndex];
            charArray[opositeSymbolIndex] = tempValue;
        }
    }
}
