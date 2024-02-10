
package task;

import java.util.Scanner;

class Vowels {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        char[] ch = new char[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Character" + (i + 1));
            ch[i] = sc.next().charAt(0);
        }
        for (char each : ch) {
            if (each == 'a' || each == 'A' || each == 'e' || each == 'E' || each == 'i' || each == 'I' || each == 'o'
                    || each == 'O' || each == 'u' || each == 'U') {
                System.out.println(each);
            }
        }

    }
}