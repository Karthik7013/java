public class Sp4 {
    // alternate for SP1

    static int n = 23871, c = 0, rev = 0, requireNumber = 0;

    public static void main(String[] args) {
        while (n != 0) {
            int rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
            c++;
        }

        while (rev != 0) {
            if (c % 2 == 0) { // only even position number extracted
                int rem = rev % 10;
                requireNumber = rem + requireNumber * 10;
            }
            c--;
            rev /= 10;
        }
        System.out.println(requireNumber);

    }

}
