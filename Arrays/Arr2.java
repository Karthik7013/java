import java.util.Scanner;

public class Arr2 {
    String name;
    int number;

    Arr2(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "Arr2 [name=" + name + ", number=" + number + "]";
    }

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size = input.nextInt();
        Arr2[] arrObj = new Arr2[size];
        for (int k = 0; k < size; k++) {
            String name = input.next();
            int number = input.nextInt();
            arrObj[k] = new Arr2(name, number);
        }
        for (Arr2 bbj : arrObj) {
            System.out.println(bbj);
        }
    }

}
