package Builder;

public class PhoneBuilder {
    String brand;
    String os;
    int price;
    String batteryCapacity;

    public PhoneBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder os(String os) {
        this.os = os;
        return this;
    }

    @Override
    public String toString() {
        return "PhoneBuilder [brand=" + brand + ", os=" + os + ", price=" + price + ", batteryCapacity="
                + batteryCapacity + "]";
    }

    public PhoneBuilder price(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder batteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }
}
