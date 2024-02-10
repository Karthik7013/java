public class Shock {
    public static void main(String[] args) {
        int space = 3;
        int star = 1;
        int bstar = 3;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (i > 4) {
                    break;
                } else {
                    System.out.print("*");
                }
            }
            if (i >= 4) {
                for (int j = 1; j <= bstar; j++) {
                    System.out.print("*");
                }
                if (i > 4) {
                    bstar--;
                }
            }
            if (i >= 4) {
                space = 3;
            } else {
                space--;
            }
            star++;
            System.out.println();
        }
    }
}
