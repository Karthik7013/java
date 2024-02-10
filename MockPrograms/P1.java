import java.util.Scanner;

/*
 * Finding the nth max from an array
 */
public class P1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] s) {

        System.out.print("Enter array size : ");
        int size = sc.nextInt(); // array size
        int[] array = new int[size]; // array size is created
        // enter array values
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Element : " + (i + 1));
            array[i] = sc.nextInt();
        }
        // showing entered array
        System.out.print("Enter array : ");
        System.out.print("[ ");
        for (int obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println(" ]");
        // sorting technique
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        System.out.print("Sorted array : ");
        System.out.print("[ ");
        for (int obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println(" ]");
        // nth max value
        System.out.println("Enter nth Max : ");
        int nMax = sc.nextInt();

        try {
            System.out.println(array[array.length - nMax]);
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("*Entered Out of Range !");
        }
    }
}
