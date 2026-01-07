package lb7.task3;

//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта.

public class Main {
    public static void main(String[] args) {
        SuperClass3 superClass3Object = new SuperClass3(10);
        System.out.println(superClass3Object.toString());
        superClass3Object.setValue(1);
        System.out.println(superClass3Object.toString());

        System.out.println();

        SubClass3 subClass3Object = new SubClass3(20, 'A');
        System.out.println(subClass3Object.toString());
        subClass3Object.setValue(2, 'B');
        System.out.println(subClass3Object.toString());

        System.out.println();

        SubSubClass3 subSubClass3Object = new SubSubClass3(30, 'A', "Это текстовое поле подкласса подкласса");
        System.out.println(subSubClass3Object.toString());
        subSubClass3Object.setValue(3, 'B', "Измененное текстовое поле подкласса подкласса");
        System.out.println(subSubClass3Object.toString());
    }
}
