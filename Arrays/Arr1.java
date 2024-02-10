import java.util.Scanner;

public class Arr1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Array Size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a item : " + (i + 1));
            arr[i] = input.nextInt();
        }
        for (double d : arr) {
            System.out.println(d);
        }
    }
}
