package lb7.task2;

public class SuperClass2 {
    private String text;

    SuperClass2(String text){
        this.text = text;
    }

    public int textLenght(String text){
        if (text == null){
            return 0;
        }
        return text.length();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setConstValue(){
        this.text = "Присвоение константы";
    }

    @Override
    public String toString() {
        String className = "Class: " + this.getClass().getSimpleName() + "\n" +
                " text = " + this.text + "\n";

        return className;
    }
}
