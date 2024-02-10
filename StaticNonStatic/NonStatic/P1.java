public class P1 {
    static int i; // static global variable
    int j = 10; // non static global variable

    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

    static public void jump() {
        System.out.println("Jump");
    }

    public void crawlC() {
        this.crawl();
    }

    public void crawl() {
        System.out.println(this);
        System.out.println("crawl");
    }

    public static void main(String[] args) {

        P1 obj = new P1();
        System.out.println(i); // directly
        System.out.println(P1.i); // Class Name***
        System.out.println(obj.i); // by creating object

        jump(); // directly
        P1.jump(); // by ClassName***
        obj.jump(); // by creating object

        // non static member by creating object for P1 class

        obj.crawl();
        obj.crawlC();

    }
}
