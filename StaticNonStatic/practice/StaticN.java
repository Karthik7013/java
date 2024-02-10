package practice;

/**
 * StaticN
 */
public class StaticN {

    static int i = 1;

    static public void main() {
        System.out.println("from main");
    }

    static {
        System.out.println("hellow SIB");
    }

    int x = 10;
    {
        System.out.println("IIB");
    }

    public void run() {
        System.out.println("IIB");
    }

    public static void main(String[] args) {

        StaticN obj = new StaticN();

        System.out.println(obj.x);

    }
}
