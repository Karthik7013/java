public class Calculator {
    public int pow(int n, int expo) {
        int res = 1;
        for (int i = 1; i <= expo; i++) {
            res *= n;
        }
        return res;
    }

    public double root(double x, double y) {
        // x**(1/y);

        double res = 1;

        for (int i = 1; i <= y; i++) {

            res *= (1 / y);
 
        }
        return .0;

    }

    public static void main(String[] args) {
        Calculator obj1 = new Calculator();

        double res = obj1.root(144, 2);
        System.out.println(res);
    }
}
