package Static;
public class SIB {

    public static void run() {
        // static initializer block ( SIB )
        System.out.print("from run Method");
    }

    static {
        run();
    }

    public static void main(String[] args) {

    }
}
