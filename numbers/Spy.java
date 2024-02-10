public class Spy {
    public static void main(String[] $) {
        System.out.println($);
        int x = 1124;
        System.out.println(spy(x));
    }

    public static String spy(int num) {
        int temp = num, sum = 0, pro = 1;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            pro *= rem;
            temp /= 10;
        }
        return (sum == pro) ? num + " is a Spy Number" : num + " is Not a Spy Number";
    }
}