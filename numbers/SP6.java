public class SP6 {
    public static void main(String[] args) {
        int n = 25;
        int sq = n * n;
        int temp = sq;
        int digitCount = 0;
        int power = 1;

        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        for (int i = 1; i < digitCount; i++) {
            power *= 10;
        }
        temp = sq;
        while (temp != 0) {
            if (n == temp) {
                System.out.println(true);
                break;
            }
            temp = temp % power;
            power /= 10;
        }
    }

}
