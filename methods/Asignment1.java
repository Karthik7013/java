public class Asignment1 {
    public static void main(String[] args) {
        System.out.println(args);
        factorial(90);
    }

    public static void factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print("Factorial of " + num + " is : " + fact);
    }
}
