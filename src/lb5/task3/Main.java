package lb5.task3;

// Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты
// без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов

public class Main {
    public static void main(String[] args) {
        Task3 first_constructor = new Task3();

        Task3 second_constructor = new Task3(1);

        Task3 third_constructor = new Task3(4, 2);

        System.out.println("Поля объекта созданного с помощью первого конструктора: "
                + first_constructor.getNum1() + " " + first_constructor.getNum2());

        System.out.println("Поля объекта созданного с помощью второго конструктора: "
                + second_constructor.getNum1() + " " + second_constructor.getNum2());
        System.out.println("Поля объекта созданного с помощью третьего конструктора: "
                + third_constructor.getNum1() + " " + third_constructor.getNum2());

    }
}
