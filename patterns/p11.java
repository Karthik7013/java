public class p11 {
    public static void main(String[] args) {
        int space = 0;
        int start = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= start; k++) {
                System.out.print("*");
            }
            space++;
            start--;
            System.out.println();
        }
    }
}
