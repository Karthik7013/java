public class fab {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);
        int c = 0;
        while (c <= 100) {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
        }

    }
}
