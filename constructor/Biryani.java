public class Biryani {

    double price;
    String type;
    String address;

    Biryani(String type, double price, String address) {
        this.type = type;
        this.price = price;
        this.address = address;
    }

    public void serve() {
        System.out.println("Serve the Biryani");
    }

    public void Bill() {
        System.out.println("bill payment :" + this.price);
    }
}
