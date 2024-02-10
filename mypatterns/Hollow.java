public class Hollow {
    public static void main(String[] args) {
        int space = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 5; j++) {
                if (i <= 1 || i >= 5) {
                    System.out.print("* ");
                } else {
                    if (j <= 1 || j >= 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            space--;
            System.out.println();
        }
    }
}
