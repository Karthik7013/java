package task;

import java.util.Scanner;

public class FibonacciSeries {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element " + (i + 1));
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (fib(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    public static boolean fib(int i) {
        int a = 0;
        int b = 1;
        int c = 0;
        while ((a + b) <= i) {
            c = a + b;
            if (c == i) {
                return true;
            }
            a = b;
            b = c;
        }
        if (i == 0 || i == 1)
            return true;
        return false;
    }
}
