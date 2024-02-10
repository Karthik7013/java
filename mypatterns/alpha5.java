public class alpha5 {
    public static void main(String[] args) {
        int space = 4;
        int star = 1;

        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (j <= star / 2 + 1) {
                    System.out.print(ch++);
                } else {
                    System.out.print(ch--);
                }
            }
            space--;
            star += 2;

            System.out.println();
        }
    }
}
