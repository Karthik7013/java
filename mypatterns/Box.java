public class Box {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                for (int j = 1; j <= 7; j++) {
                    System.out.print("*");
                }
            }
            if (i > 1 && i < n) {
                
            }
            if (i == n) {
                for (int j = 1; j <= 7; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}