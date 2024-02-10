package task;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] newArray = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                newArray[j][i] = a[i][j];
            }
        }
        System.out.println("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println(" ]");
        }
        System.out.print("]");

    }
}
