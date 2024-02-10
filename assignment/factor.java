public class factor {
    public static void main(String[] args) {
        // factorial of a given number
        int fact = 1;
        int num = 9;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print(fact);
    }
}
