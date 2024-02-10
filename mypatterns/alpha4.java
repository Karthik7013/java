public class alpha4 {
    public static void main(String[] args) {
        int space = 0;
        int star = 5;

        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print(ch++ + " ");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
