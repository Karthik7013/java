import java.util.Scanner;

public class A1 {
    static Scanner input = new Scanner(System.in);
    static int min;
    static String output = "";

    public static void main(String[] args) {
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("element insert : ");
            array[i] = input.nextInt();
        }
        int iteration = size - 1;
        min = array[array.length - 1] - 1;
        for (int j = 0; j < array.length; j++) {
            for (int i = iteration; i < array.length; i++) {
                if (array[i] > min) {
                    output = array[i] + " " + output;
                    min = array[i];
                }
            }
            iteration--;
        }
        System.out.println(output);
    }

}
