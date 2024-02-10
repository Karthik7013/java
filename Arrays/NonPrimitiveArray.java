import java.util.Scanner;

public class NonPrimitiveArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BluePrint[] array = new BluePrint[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("enter bus name : ");
            String name = sc.next();
            System.out.print("enter bus number");
            int number = sc.nextInt();
            array[i] = new BluePrint(name, number);
        }
        System.out.println(array);

        for (BluePrint each : array) {
            System.out.println(each);
        }
    }
}
