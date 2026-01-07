package lb7.task4;

public class SubSubClass4 extends SubClass4{

    public int num;

    SubSubClass4(char symbol, String str, int num){
        super(symbol, str);
        this.num = num;
    }

    @Override
    public SubSubClass4 createCopyOfClass(){
        SubSubClass4 copyOfSubSubClass4 = new SubSubClass4(this.symbol, this.str, this.num);
        return  copyOfSubSubClass4;
    }

    @Override
    public String toString(){
        String classData = super.toString() + "\n" +
                " num = " + this.num;
        return classData;
    }
}
