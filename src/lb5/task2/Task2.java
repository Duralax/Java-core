package lb5.task2;

public class Task2 {

    private char symbol1;
    private char symbol2;

    public void setSymbol1(char symbol1) {
        this.symbol1 = symbol1;
    }

    public void setSymbol2(char symbol2) {
        this.symbol2 = symbol2;
    }

    public void showCharsRange(){
        char startSymbol = symbol1;
        char endSymbol = symbol2;

        if (symbol2 < symbol1) {
            startSymbol = symbol2;
            endSymbol = symbol1;
        }

        for (int i = startSymbol; i <= endSymbol; i++){
            System.out.println((char)i);
        }
    }

}
