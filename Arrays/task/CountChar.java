package task;

import java.util.Scanner;

public class CountChar {
    static int alphaCount = 0;
    static int specialChar = 0;
    static int integer = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        char[] ch = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Character : ");
            ch[i] = sc.next().charAt(0);
        }
        for (char each : ch) {
            if ((each <= 'z' && each >= 'a') || (each <= 'Z' && each >= 'A')) {
                alphaCount++;
            } else if (each >= '0' && each <= '9') {
                integer++;
            } else {
                specialChar++;
            }
        }
        System.out.println(alphaCount);
        System.out.println(specialChar);
        System.out.println(integer);
    }

}
