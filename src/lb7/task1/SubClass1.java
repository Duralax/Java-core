package lb7.task1;

public class SubClass1 extends SuperClass1 {

    private String str2;

    SubClass1(String str1) {
        super(str1);
    }
    SubClass1(String str1, String str2) {
        super(str1);
        this.str2 = str2;
    }

    @Override
    public String toString(){
        String superClassName = "Class: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + super.getStr1() + "\n" +
                " str2 = " + this.str2;
        return superClassName;
    }
}
