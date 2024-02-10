public class butter {
    public static void main(String[] args) {
        int star = 1, space = 5;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= star; j++) {
                if (i == 4 && j == 4) {
                    System.out.print("");
                } else {
                    System.out.print("* ");
                }
            }

            if (i <= 3) {
                space -= 2;
                star++;
            } else {
                space += 2;
                star--;
            }
            System.out.println();
        }
    }
}
