class P1 {
    public static void main(String[] args) {
        int star = 1;
        int space = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < star; k++) {
                if (i == 1 || i == 5) {
                    System.out.print("$ ");
                } else {
                    System.out.print("* ");
                }
            }
            if (i < 3) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }

}
