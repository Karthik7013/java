public class p9 {
    public static void main(String[] args) {
        int start = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= start; j++) {
                System.out.print("*");

            }
            ++start;
            System.out.println();
        }
    }
}
