public class Swap {
    public static void main(String[] args) {
        // using third variable
        int x = 10;
        int y = 20;
        System.out.println(x + "--" + y);
        int z = x + y;
        x = z - x;
        y = z - x;
        System.out.println(x + "--" + y);
    }
}
