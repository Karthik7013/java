public class p22 {
    public static void main(String[] args) {
        int space = 2, star = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            if (i < 3) {
                space--;
                star += 2;
            } else if (i == 3) {
                space = 2;
                star = 1;
            } else {
                space--;
                star += 2;
            }

            System.out.println();
        }
    }
}
