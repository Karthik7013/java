public class p4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i % 2 == 0) {
                    if (j > 1 && j < 4) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
