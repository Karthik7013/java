public class p3 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            int num = 5;
            for (int j = 1; j <= i; j++) {
                System.out.print(num--);
            }
            System.out.println();
        }

    }
}
