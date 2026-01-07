package lb7.task2;

public class SubClass2 extends SuperClass2 {

    public int num;

    SubClass2(String text, int num){
        super(text);
        this.num = num;
    }

    @Override
    public String getText() {
        return super.getText();
    }

    @Override
    public void setText(String text){
        super.setText(text);
    }

    @Override
    public void setConstValue(){
        super.setConstValue();
        this.num = 0;
    }

    public void setValue(int num){
        super.setConstValue();
        this.num = num;
    }

    public void setValue(int num, String text){
        super.setText(text);
        this.num = num;
    }

    @Override
    public String toString(){
        String className = "Class: " + this.getClass().getSimpleName() + "\n" +
                " text = " + super.getText() + "\n" +
                " num = " + this.num + "\n";
        return className;
    }
}
