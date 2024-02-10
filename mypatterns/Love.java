public class Love {
    public static void main(String[] args) {
        int star = 7;
        int space = 0;

        System.out.println("  * *   * * ");

        System.out.println("* * * * * * *");
        for (int i = 1; i <= 6; i++) {
            if (i >= 3) {
                for (int j = 1; j <= space; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= star; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                star -= 2;
                space++;
            } else {

            }
        }

    }
}
