public class Assignment2 {
    public static void main(String[] args) {
        sum(234567532);

    }

    public static void sum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 != 0) {
                sum = sum + rem;
            }
            num = num / 10;
        }
        System.out.println("Sum of Individual Odd Number are " + ": " + sum);
    }
}
