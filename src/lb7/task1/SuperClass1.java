package lb7.task1;

public class SuperClass1 {
    private String str1;

    SuperClass1(String str1){
        this.str1 =str1;
    }

    @Override
    public String toString(){
        String superClassName = "Class: " + this.getClass().getSimpleName() + "\n" +
                " str1 = " + this.str1;
        return superClassName;
    }

    public String getStr1(){
        return this.str1;
    }

}
