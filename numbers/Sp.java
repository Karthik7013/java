public class Sp {

    // form a number extracting prime numbers
    public static void main(String[] args) {
        int n = 28147309, res = 0, p = 1;
        while (n != 0) {
            int r = n % 10;
            if (isPrime(r)) {
                res = r * p + res;
                p *= 10;
            }
            n /= 10;
        }
        System.out.println(res);
    }

    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
