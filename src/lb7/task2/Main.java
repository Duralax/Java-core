package lb7.task2;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе (суперклассе) должен быть метод для присваивания значения полю с
//текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки. На
//основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое
//(публичное) целочисленное поле. В классе должны быть такие версии метода для
//присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).

public class Main {
    public static void main(String[] args) {
        SuperClass2 superClass2Object = new SuperClass2("поле супер класса");
        System.out.println(superClass2Object.toString());

        SubClass2 subClass2Object1 = new SubClass2("поле суб. класса", 2);
        System.out.println(subClass2Object1.toString());

        subClass2Object1.setValue(45);
        System.out.println(subClass2Object1.toString());

        subClass2Object1.setText("измененное поле суб. класса");
        System.out.println(subClass2Object1.toString());

        subClass2Object1.setConstValue();
        System.out.println(subClass2Object1.toString());

        subClass2Object1.setValue(77, "новый текст поля");
        System.out.println(subClass2Object1.toString());
    }
}
