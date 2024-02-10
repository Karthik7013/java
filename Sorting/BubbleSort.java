
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = { 6, 3, 10, 4, 12 };
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
