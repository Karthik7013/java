package Builder;

public class Phone {
    String brand;
    String os;
    int price;
    String batteryCapacity;

    public Phone(String brand, String os, int price, String batteryCapacity) {
        this.brand = brand;
        this.os = os;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone [brand=" + brand + ", os=" + os + ", price=" + price + ", batteryCapacity=" + batteryCapacity
                + "]";
    }
}
