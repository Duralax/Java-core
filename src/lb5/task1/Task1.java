package lb5.task1;

//Напишите программу с классом, в котором есть закрытое символьное поле и
//три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.

public class Task1 {

    private char symb;

    public void setSymb(char symb) {
        this.symb = symb;
    }

    public int getSymbCode() {
        return symb;
    }

    public void showInfo(){
        System.out.println("Символ: " + symb + " код символа: " + getSymbCode());
    }

}
