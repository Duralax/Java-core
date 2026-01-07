package lb7.task5;

public class SubClass2_5 extends SuperClass5{

    private int num;

    SubClass2_5(String text, int num){
        super(text);
        this.num = num;
    }

    @Override
    public void showClassInfo(){
        System.out.println("SubClass2_5" + "\n" + " text = " +
                super.getText() + "\n" + " num = " + this.num );
    }


}
