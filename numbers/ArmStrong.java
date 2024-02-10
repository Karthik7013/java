public class ArmStrong {
    public static void main(String[] args) {
        int range = 10000;
        while (range >= 10) {
            if (armStrong(range) == range) {
                System.out.println(range);
            }
            range--;
        }
    }

    public static int armStrong(int num) {
        int sum = 0;
        int num1 = num;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        while (num1 > 0) {
            int rem = num1 % 10;
            int result = 1;
            for (int j = 1; j <= count; j++) {
                result *= rem;
            }
            sum += result;
            num1 /= 10;
        }
        return sum;
    }
}
