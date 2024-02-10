public class p20 {
    public static void main(String[] args) {
        int size = 7,
                star = 1,
                space = size / 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            if (i < size / 2 + 1) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }

            System.out.println();
        }
    }
}
