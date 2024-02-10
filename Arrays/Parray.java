import java.util.Scanner;

public class Parray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int[] primitiveArray = { 1, 3, 4, 5 };

        int[] a1 = new int[10];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println(a1);
    }
}
