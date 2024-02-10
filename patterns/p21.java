public class p21 {
    public static void main(String[] args) {
        int space = 3;
        int star = 1;
        for (int i = 1; i <= 9; i++) {
            if (i <= 4) {
                for (int q = 1; q <= space; q++) {
                    System.out.print(" ");
                }

                for (int q = 1; q <= star; q++) {
                    System.out.print("*");
                }

                for (int q = 1; q < 3; q++) {
                    if (i == 1) {
                        System.out.print("-");

                    } else {

                        System.out.print(" ");
                    }

                }

                for (int q = 1; q <= star; q++) {
                    System.out.print("*");
                }

                space--;
                star++;
            } else {
                for (int m = 1; m < 5; m++) {
                    System.out.print(" ");
                }
                for (int s = 1; s <= 2; s++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
