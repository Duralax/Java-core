package lb7.task4;

//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания

public class Main {
    public static void main(String[] args) {
        SuperClass4 superClass4Object  = new SuperClass4('A');
        SuperClass4 copySuperClass4Object = superClass4Object.createCopyOfClass();
        System.out.println(superClass4Object.toString());
        System.out.println(copySuperClass4Object.toString());
        System.out.println(copySuperClass4Object == superClass4Object);

        System.out.println();

        SubClass4 subClass4Object = new SubClass4('B', "поле подкласса суперкласса");
        SubClass4 copySubClass4Object = subClass4Object.createCopyOfClass();
        System.out.println(subClass4Object.toString());
        System.out.println(copySubClass4Object.toString());
        System.out.println(copySubClass4Object == subClass4Object);

        System.out.println();

        SubSubClass4 subSubClass4Object = new SubSubClass4('C', "поле подкласса подкласса", 11);
        SubSubClass4 copySubSubClass4Object = subSubClass4Object.createCopyOfClass();
        System.out.println(subSubClass4Object.toString());
        System.out.println(copySubSubClass4Object.toString());
        System.out.println(subSubClass4Object == copySubSubClass4Object);
    }

}
