package Static;
class Static1 {
    static int i = 10; // static global variable

    public static void run() {
        // static context
        System.out.println("hellow world");
    }

    public static void main(String[] args) {
        int i = 100;
        System.out.println(i);
        System.out.println(Static1.i);
        run();
        Static1.run();
    }

}
