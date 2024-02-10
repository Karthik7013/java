public class P4 {
    // 0 1 1 2 3 5 8 13 21 34 55 89
    static int a = 0, b = 1;
    static int end = 100;

    public static void main(String[] args) {

        System.out.print(P4.a + " ");
        System.out.print(P4.b + " ");
        fib(P4.a + P4.b);
    }

    public static void fib(int c) {
        System.out.print(c + " ");
        P4.a = b;
        P4.b = c;
        if (P4.a + P4.b <= end) {
            fib(P4.a + P4.b);
        }
    }
    // ======================
    // public static void main(String[] args) {
    // int a = 0, b = 1;
    // while (a + b <= 100) {
    // int c = a + b;
    // System.out.print(c + " ");
    // a = b;
    // b = c;
    // }
    // }

}
