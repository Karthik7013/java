/**
 * P29
 */
public class P29 {

    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 != 0) {
                    System.out.print(k++ + " ");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }

                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                    System.out.print(--k + " ");
                }
            }
            System.out.println();
        }
    }
}