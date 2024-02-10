public class P4 {

    static String s = "this is fist keywords";
    // thiS iS thiS keyword;
    static String newString = "";

    public static void main(String[] args) {
        String[] sArray = s.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            sArray[i] = sCap(sArray[i]);
        }

        for (String obj : sArray) {
            obj = obj + " ";
            newString += obj;
        }
        System.out.println(newString.trim());
    }

    public static String sCap(String alpha) {
        String result = "";
        for (int i = 0; i < alpha.length(); i++) {
            if (alpha.charAt(i) == 's') {
                String s1 = alpha.charAt(i) + "";
                String upperS = s1.toUpperCase();
                result += upperS;
            } else {
                result += alpha.charAt(i);
            }
        }
        return result;
    }
}
