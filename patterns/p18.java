public class p18 {
    public static void main(String[] args) {
        int space = 3;
        int star = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }

            for (int k = 1; k <= 4; k++) {
                if (i >= 3 && i <= 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int l = 1; l <= star; l++) {
                System.out.print("* ");
            }

            if (i < 4) {
                space--;
                star++;
            } else {
                space++;
                star--;
            }
            System.out.println();
        }
    }
}
