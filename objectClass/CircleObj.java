public class CircleObj {
    public static void main(String[] args) {
        Circle obj = new Circle();
        double area = obj.area();
        double circum = obj.circumference();

        System.out.println(area);
        System.out.println(circum);
    }
}
