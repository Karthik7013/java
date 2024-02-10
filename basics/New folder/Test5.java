public class Test5 {
    public static void main(String[] args) {
        char ch = '^';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch <= 0 && ch >= 0)) {
            System.out.println(ch + " container alphabet or digit");
        } else {
            System.out.println(ch + " char contain special char");
        }
    }
}
