package Factory;

public class ButtonFactory {
    public static ButtonInterface Button(String type) {
        switch (type) {
            case "WINDOWS":
                return new WindowsButton();
            case "MAC":
                return new MacButton();
            default:
                return new WindowsButton();
        }
    }
}
