package lb7.task3;

public class SubClass3 extends SuperClass3{

    public char symbol;

    SubClass3 (int num, char symbol){
        super(num);
        this.symbol = symbol;
    }

    public void setValue(int num, char symbol){
        super.setValue(num);
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        String classData = super.toString() + "\n" +
                " symbol = " + this.symbol;
        return classData;
    }
}
