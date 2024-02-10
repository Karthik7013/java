package task;

public class DistinctElements {
    public static void main(String[] args) {
        int size = 0, index = 0;
        int[] a = { 1, 1, 4, 5, 6 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i > j) {
                    break;
                }
                if (a[i] == a[j]) {
                    size++;
                    break;
                }
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i > j) {
                    break;
                }
                if (a[i] == a[j]) {
                    array[index++] = a[i];
                    break;
                }
            }
        }

        for (int gh : array) {
            System.out.println(gh);
        }

    }
}
