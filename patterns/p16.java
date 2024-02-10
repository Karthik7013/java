public class p16 {
    public static void main(String[] args) {
        int star = 3, space = -1;
        for (int i = 1; i <= 5; i++) {
            if (i <= 3) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
