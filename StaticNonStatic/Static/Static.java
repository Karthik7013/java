package Static;
class Static {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static String s1;
    static boolean b1;

    public static void main(String[] args) {
        System.out.println(Static.b);
        System.out.println(Static.s); // using className also working
        System.out.println(i); // directly also works
        System.out.println(l);
        System.out.println("**************");
        System.out.println(f);
        System.out.println(d);
        System.out.println("**************");
        System.out.println(s1);
        System.out.println(b1);
    }
}
