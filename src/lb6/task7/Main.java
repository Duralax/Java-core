package lb6.task7;

//7. Напишите программу со статическим методом,
// аргументом которому передастся символьный массив,
// а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива-аргумента.

public class Main {
    public static void main(String[] args) {

        char[] charArray = {'V', 'N', 'Z', 'C', 'b', 'O'};

        System.out.println("Символьный массив: ");

        for (char i : charArray){
            System.out.print(i + " ");
        }

        System.out.println("\nКоды символов массива: ");

        int[] intArray = getCharArrayCodes(charArray);

        for (int ch : intArray){
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static int[] getCharArrayCodes(char[] charArray){
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++){
            intArray[i] = charArray[i];
        }
        return intArray;
    }
}
