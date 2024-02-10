public class Rev {
    public static void main(String[] $) {
        int num = 1234, c = 0, temp = num, test = 1, rev = 0;
        while (temp > 0) {
            temp /= 10;
            c++;
        }
        for (int i = 1; i < c; i++) {
            test *= 10;
        }
        while (num > 0) {
            int rem = num % 10;
            rev += rem * test;
            num /= 10;
            test /= 10;
        }
        System.out.println(rev);
    }
}
