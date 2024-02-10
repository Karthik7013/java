import java.util.Scanner;

/*
 * digit that contains 7 init
 */

public class P2 {

    static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        System.out.print("Enter Min Value : ");
        int minVal = sc.nextInt();
        System.out.print("Enter Max Value : ");
        int maxVal = sc.nextInt();

        // ============== logic one =============== //
        // System.out.print("[ ");
        // for (int i = minVal; i <= maxVal; i++) {
        // String s = i + "";
        // if (s.contains("7")) {
        // System.out.print(s + " ");
        // count++;
        // }
        // }
        // System.out.println("] = " + count);
        // ============== logic two =============== //

        System.out.print("[ ");
        for (int i = minVal; i <= maxVal; i++) {
            if (extractNum(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("] = " + count);
    }

    public static boolean extractNum(int digit) {
        int temp = digit;
        while (temp != 0) {
            int res = temp % 10;
            if (res == 7) {
                count++;
                return true;
            }
            temp /= 10;
        }
        return false;
    }
}
