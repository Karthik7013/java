public class SumOfOdd {
    public static void main(String[] args) {
        int i = 1234567, sum = 0;

        while (i > 0) {
            int rem = i % 10;
            if (i % 2 != 0)
                sum += (rem * rem);
            i /= 10;
        }
        System.out.println(sum);
    }
}
