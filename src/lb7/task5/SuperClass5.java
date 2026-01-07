package lb7.task5;

public class SuperClass5 {

    private String text;

    SuperClass5(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void showClassInfo(){
        System.out.println("SuperClass5" + "\n" + " text = " + this.text);

    }
}
