public class p15 {
    public static void main(String[] args) {
        int space = 2;
        int star = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            if (i < 3) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            System.out.println();
        }
    }
}
