public class TryCatch {
    static public int run() {
        try {
            System.out.println("try");
            // System.exit(0);
            return 1;

        } catch (Exception e) {
            System.out.println("Catch");
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        int i = TryCatch.run();
        System.out.println(i);
    }
}
