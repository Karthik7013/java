package task;

import java.util.Scanner;

public class MaxMinArry {

    /*
     * find max and min from an array;
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.print("enter size of array : ");
        // int size = sc.nextInt();
        int[] intArray = { 10, 2, 3, 4, 5 };

        // for (int i = 0; i < size; i++) {
        // System.out.print("Enter element : " + i);
        // intArray[i] = sc.nextInt();
        // }
        int min = intArray[0];
        int max = intArray[0];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                if (intArray[i] < intArray[k]) {
                }

            }
        }
        System.out.println(max);
    }

}