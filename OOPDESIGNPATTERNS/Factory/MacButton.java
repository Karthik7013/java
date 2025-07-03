package Factory;



public class MacButton implements ButtonInterface {
    @Override
    public void onClick() {
        System.out.println("Button Clicked By Mac");
    }
}