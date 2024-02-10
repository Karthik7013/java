class p8 {
    public static void main(String[] args) {
        int size = 11;

        int c = size;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            --c;
            System.out.println();
        }
    }
}
