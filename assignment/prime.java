public class prime {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}