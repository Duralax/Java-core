package lb7.task4;

public class SubClass4 extends SuperClass4{

    public String str;

    SubClass4(char symbol, String str){
        super(symbol);
        this.str = str;
    }

    @Override
    public SubClass4 createCopyOfClass(){
        SubClass4 copyOfSubClass4 = new SubClass4(this.symbol, this.str);
        return copyOfSubClass4;
    }
    @Override
    public String toString(){
        String classData = super.toString() + "\n" +
                " str = " + this.str;
        return classData;
    }
}
