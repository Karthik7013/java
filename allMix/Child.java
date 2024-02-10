public class Child extends Parent {
    public static void main(String[] args) {
        System.out.println(i);
        parentMethod();
        System.out.println("*****************");
        Child ch = new Child();
        ch.parentMethod1();
    }

    public static void parentMethod() {
        System.out.println("child Method");
    }

    public void parentMethod1() {
        System.out.println("Child Method1-----------");
    }

    static int i = 4567;
}
