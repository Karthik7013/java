package Strings.problems;

import java.util.Scanner;

// html css java = lmth ssc avaj

public class Str1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        String newStr = "";
        String[] strArray = str.split(" ");
        // System.out.println(strArray);

        for (int i = 0; i < strArray.length; i++) {
            newStr += reverse(strArray[i]);
        }
        System.out.println(newStr);
    }

    public static String reverse(String s) {
        String reverseStr = "";
        for (int i = 0; i < s.length(); i++) {
            reverseStr = s.charAt(i) + reverseStr;
        }
        return reverseStr + " ";
    }

}
