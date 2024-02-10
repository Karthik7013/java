public class Circle {
    static double pi = 22.7;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Circle.pi * this.radius * this.radius;
    }

    public double circumference() {
        return 2 * Circle.pi * this.radius;
    }
}
