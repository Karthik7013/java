public class Reverse {
    public static void main(String[] $) {
        System.out.println(reverse(8974511));
    }

    public static int reverse(int num) {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp /= 10;
        }
        return reverse;
    }
}