class P2 {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4) {
                    if (j == 1 || j == 4) {
                        System.out.print(n-- + " ");

                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (j == 1 || j == 4) {
                        System.out.print("* ");

                    } else {
                        System.out.print(n-- + " ");
                    }
                }
            }
            System.out.println();
        }
    }

}
