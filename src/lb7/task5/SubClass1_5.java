package lb7.task5;

public class SubClass1_5 extends SuperClass5{

    private char symbol;

    SubClass1_5(String text,char symbol){
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void showClassInfo(){
        System.out.println("SubClass1_5" + "\n" + " text = " +
                super.getText() + "\n" + " symbol = " + this.symbol);
    }
}
