package lb6.task1;

//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
// В классе должен быть перегруженный метод для присваивания значений полям. Если метод вызывается с символьным аргументом,
// то соответствующее значение присваивается символьному полю. Если метод вызывается с текстовым аргументом,
// то он определяет значение текстового ноля. Методу аргументом также может передаваться символьный массив.
// Если массив состоит из одного элемента, то он определяет значение символьного поля.
// В противном случае (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.

public class Main {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();

        myClass1.setCh1OrStr1('l');
        myClass1.setCh1OrStr1("Привет");

        System.out.println(myClass1.ch1);
        System.out.println(myClass1.str1);

        char[] chars = new char[5];
        chars[0] = 'П';
        chars[1] = 'о';
        chars[2] = 'к';
        chars[3] = 'а';
        chars[4] = '!';

        myClass1.setCh1OrStr1(chars);
        System.out.println(myClass1.str1);

        char[] chars1 = new char[1];
        chars1[0] = 'Ц';

        myClass1.setCh1OrStr1(chars1);

        System.out.println(myClass1.ch1);

    }
}
