public class alpha6 {
    public static void main(String[] args) {
        int star = 1;
        int space = 4;
        int num = 1;
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch++);
                } else {
                    if (num == 10) {
                        num = 1;
                    }
                    System.out.print(num++);
                }
            }
            star += 2;
            space--;
            System.out.println();
        }
    }
}
