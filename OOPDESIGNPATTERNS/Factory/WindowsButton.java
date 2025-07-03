package Factory;

public class WindowsButton implements ButtonInterface {
    @Override
    public void onClick() {
        System.out.println("Button Clicked By Windows");
    }
}