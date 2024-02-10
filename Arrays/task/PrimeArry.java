package task;

import java.util.Scanner;

/**
 * PrimeArry
 */
public class PrimeArry {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter Array size : ");
        int size = sc.nextInt();
        int[] intArry = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Array Element");
            intArry[i] = sc.nextInt();
        }
        for (int i : intArry) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}