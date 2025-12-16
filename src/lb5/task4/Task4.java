package lb5.task4;

public class Task4 {

    private char symbol;
    private int num;

    public Task4(int num ,char symbol){
        this.symbol = symbol;
        this.num = num;
    }

    public Task4(double value){
        int symbolCodePart = (int) value;
        symbol = (char) symbolCodePart;

        double numPartInDouble = (value - (double)symbolCodePart) * 100;

        num = (int) numPartInDouble;
    }

    public int getNum() {
        return num;
    }

    public char getSymbol() {
        return symbol;
    }
}
