public class Palindrome {
    public static void main(String[] $) {
        System.out.println(palindrome(12321));
    }

    public static String palindrome(int num) {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp /= 10;
        }
        return (num == reverse ? num + " is Palindrome" : num + " is not Palindrome");
    }
}
