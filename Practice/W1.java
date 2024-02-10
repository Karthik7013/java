
public class W1 {
    public static void main(String[] args) {
        int star = -1, space = 6;
        char ch = 65;
        for (int i = 0; i < 5; i++) {
            star += 2;
            space--;

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {

                if (k < star / 2 + 1) {
                    System.out.print(ch++);
                } else {
                    System.out.print(ch--);
                }
            }
            System.out.println();
        }
    }
}
