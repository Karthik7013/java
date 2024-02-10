
public class This {
    double p;
    double q;
    int x;
    int y;

    This(double p, double q) {
        System.out.println("first");
        this.p = p;
        this.q = q;
    }

    This(int x, int y) {
        this(1.0, 2.0);
        System.out.println("last");
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        This obj = new This(2, 3);
    }
}
