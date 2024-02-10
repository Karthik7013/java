package task;

public class MinMax {
    static int min;

    public static void main(String[] args) {

        int[] arr = { 10, 55, 66, 1, 4 };
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
    }

    public int MaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
