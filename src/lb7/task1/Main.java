package lb7.task1;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString (). В
//обоих классах метод toString () переопределяется так, что он возвращает строку с названием
//класса и значение текстового поля или текстовых полей.

public class Main {
    public static void main(String[] args) {
        SuperClass1 superClassObject = new SuperClass1("Строка супер класса");
        System.out.println(superClassObject.toString());

        SubClass1 subClassObject1 = new SubClass1("Строка подкласса ");
        System.out.println(subClassObject1.toString());

        SubClass1 subClassObject2 = new SubClass1("Еще одна строка подкласса", "Вторая строка");
        System.out.println(subClassObject2.toString());
    }
}
