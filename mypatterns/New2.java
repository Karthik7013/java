public class New2 {
    public static void main(String[] args) {
        pattern(10);
    }

    public static void pattern(int n) {
        int star = n - 1;
        for (int i = 1; i <= n; i++) {
            int num = n - (n - 1); // take direct 1
            for (int j = 1; j <= n - star; j++) {
                System.out.print(num++);
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }

    }
}
