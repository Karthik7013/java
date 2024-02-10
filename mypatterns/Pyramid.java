public class Pyramid {
    public static void main(String[] $) {
        int size = 14, space = size - 1, star = 1, space1 = size / 2 - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            if (i <= size / 2) {
                for (int j = 1; j <= star; j++) {
                    System.out.print("* ");
                }
            }
            if (i > size / 2) {
                for (int j = 1; j <= star - size / 2; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j <= space1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= star - size / 2; j++) {
                    System.out.print("* ");
                }
                space1--;
            }
            star++;
            space--;
            System.out.println();
        }
    }
}
