/**
 * test
 */
public class alpha {

    public static void main(String[] args) {

        char ch = 'A';
        int n = ch;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) n + " ");
            }
            n++;
            System.out.println();
        }
    }
}