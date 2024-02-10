class Circle {
    static double pI = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pI * this.radius * this.radius;
    }
}