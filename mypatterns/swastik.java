public class swastik {
    public static void main(String[] args) {
        /*
         * swastik pattern====
         */
        int z = 9;
        for (int i = 1; i <= z; i++) {

            for (int j = 1; j <= z / 2; j++) {
                if (i == z / 2 + 1 || i == z) {
                    System.out.print("* ");
                } else {
                    if (j == 1 && i <= z / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            for (int j = 1; j <= z; j++) {
                if (j == z / 2 + 1) {
                    System.out.print("* ");
                }
            }

            for (int j = 1; j <= z / 2; j++) {
                if (i == z / 2 + 1 || i == 1) {
                    System.out.print("* ");
                } else {
                    if (j == z / 2 && i >= z / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }

}
