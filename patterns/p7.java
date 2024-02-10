
public class p7 {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= c; j++) {
                if (j < c) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            ++c;
            System.out.println("");
        }
    }
}
