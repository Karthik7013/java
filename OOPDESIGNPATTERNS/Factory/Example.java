package Factory;

public class Example {
    public static void main(String[] args) {
        ButtonInterface button = ButtonFactory.Button("WINDOWS");
        button.onClick();
    }
}