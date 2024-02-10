
public class Second {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 2, 3, 1, 3 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i + 1; j++) {
                if (arr[i] == j) {
                    break;
                } else {
                    System.out.print(arr[j]);
                }
            }
        }
    }
}
