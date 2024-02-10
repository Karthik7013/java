public class Sp7 {
    public static void main(String[] args) {
        int n = 9874;
        int sum = extractSum(n);
        while (sum > 9) {
            sum = extractSum(sum);

        }
        System.out.println(sum);
    }

    public static int extractSum(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

}
