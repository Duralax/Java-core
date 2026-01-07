package lb7.task3;

public class SuperClass3 {
    public int num;

    SuperClass3 (int num){
        this.num = num;
    }

    public void setValue(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        String classData = " Class: " + this.getClass().getSimpleName() + "\n" +
                " num = " + this.num;
        return classData;
    }
}
