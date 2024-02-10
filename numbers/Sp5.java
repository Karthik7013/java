public class Sp5 {
    // extract prime positioned numbers;
    public static void main(String[] args) {

        int num = 123456, digitCount = 0, temp = num, serial = 1;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        int power = 1;
        for (int i = 1; i < digitCount; i++) {
            power *= 10;
        }

        temp = num;
        int require = 0;
        while (temp != 0) {
            if (isPrime(serial)) {
                int rem = temp / power;
                require = rem + require * 10;
            }
            temp = temp % power;
            power /= 10;
            serial++;
        }
        System.out.println(require);

    }

    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */

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
