public class Reverse {
    public static void main(String[] args) {
        int n = 250212, digit = 1, revNum = 0;
        while (n > 0) {
            int rem = n % 10;
            if (isPrime(rem)) {
                revNum = revNum + (rem * digit);
                digit *= 10;
            }
            n /= 10;
        }
        System.out.println(revNum);
    }

    public static boolean isPrime(int rem) {
        if (rem <= 1) {
            return false;
        }
        for (int i = 2; i <= rem / 2; i++) {
            if (rem % i == 0) {
                return false;
            }
        }
        return true;
    }
}
