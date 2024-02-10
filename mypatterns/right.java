class right {
    public static void main(String[] args) {
        int star = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i >= 3 && i <= 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            if (i < 4) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}
