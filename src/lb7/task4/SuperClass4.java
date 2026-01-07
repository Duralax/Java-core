package lb7.task4;

public class SuperClass4 {

    public char symbol;

    SuperClass4(char symbol){
        this.symbol = symbol;
    }

    public SuperClass4 createCopyOfClass(){
        SuperClass4 copySuperClass4 = new SuperClass4(this.symbol);
        return copySuperClass4;
    }

    @Override
    public String toString(){
        String classData = "Class: " + this.getClass().getSimpleName() + "\n"+
                " symbol = " + this.symbol;
        return classData;
    }
}
