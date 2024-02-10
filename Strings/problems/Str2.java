package Strings.problems;

public class Str2 {
    public static void main(String[] args) {
        String str = "abbcacdddd";
        // o/p => a-2 b-2 c-3 d-4
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            output = output + str.charAt(i) + "-" + count + " ";
        }
        System.out.println(output);
    }
}
