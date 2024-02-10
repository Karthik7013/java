public class extract {
    // sum of digits
    public static void main(String[] args) {
        int num = 143;
        int sum = 0;
        while (num > 0) {
            int number = num % 10;
            sum += number;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
