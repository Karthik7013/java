public class P3 {

    /*
     * ascending order of max string length
     */

    static String s = "Welcome to Java Tutorials";

    static int maxStringLength = 0;
    static String maxString = "";

    public static void main(String[] args) {

        String[] sArray = s.split(" ");
        for (String obj : sArray) {
            if (obj.length() > maxStringLength) {
                maxStringLength = obj.length();
                maxString = obj;
            }
        }
        // displayin in a char array
        char[] ch = maxString.toLowerCase().toCharArray(); // converts string to char[]
        System.out.print("[ ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println("]");

        // sorting array

        for (int i = 0; i < ch.length; i++) {
            for (int j = 1; j < ch.length; j++) {
                if (ch[j - 1] > ch[j]) {
                    char temp = ch[j];
                    ch[j] = ch[j - 1];
                    ch[j - 1] = temp;
                }
            }
        }

        // result array
        System.out.print("[ ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println("]");
    }
}
