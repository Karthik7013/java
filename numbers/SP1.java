public class SP1 {
    // extract even position numbers
    public static void main(String[] args) {
        int n = 23871, temp = n, c = 0, revNum = 0, power = 1, requireNumber = 0;
        while (temp != 0) {
            c++;
            temp /= 10;
        }
        for (int k = 1; k < c; k++) {
            power *= 10;
        }
        temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            revNum = revNum + (rem * power); 
            power /= 10;
            temp /= 10;
        }
        System.out.println(n); // 23871 actual number
        System.out.println(revNum); // 17832 number reversed

        temp = revNum; // extracting reverse number
        while (temp != 0) {
            if (c % 2 == 0) { // only even position number extracted
                int rem = temp % 10;
                requireNumber = rem + requireNumber * 10;
            }
            c--;
            temp /= 10;
        }
        System.out.println(requireNumber);
    }
}
