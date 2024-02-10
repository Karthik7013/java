public class Rectangle {
    static String object_name = "rectangle";
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public double diagonal() {
        return Math.pow((this.height * this.height) + (this.width * this.width), 0.5);
    }

}