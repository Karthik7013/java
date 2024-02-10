public class Strong {
    public static void main(String[] args) {
        int range = 10000;
        while (range >= 1) {
            if (strong(range) == range) {
                System.out.println(range);
            }
            range--;
        }
    }

    public static int strong(int num) {
        int sum = 0;
        while (num > 0) {
            int fact = 1;
            int rem = num % 10;
            for (int j = 1; j <= rem; j++) {
                fact *= j;
            }
            sum += fact;
            num /= 10;
        }
        return sum;
    }
}
