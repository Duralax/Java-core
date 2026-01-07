package lb7.task3;

public class SubSubClass3 extends SubClass3{

    public String str2;

    SubSubClass3 (int num, char symbol, String str2){
        super(num, symbol);
        this.str2 = str2;
    }

    public void setValue(int num, char symbol, String str2){
        super.setValue(num, symbol);
        this.str2 = str2;
    }

    @Override
    public String toString(){
        String classData = super.toString() + "\n" +
                " str2 = " + this.str2;
        return classData;
    }
}
