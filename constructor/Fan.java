public class Fan {
    int maxSpeed;
    String type;
    String color;

    Fan(int maxSpeed, String type, String color) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.color = color;
    }

    public void on() {
        System.out.println("on");
    }

    public void off() {
        System.out.println("off");
    }

}