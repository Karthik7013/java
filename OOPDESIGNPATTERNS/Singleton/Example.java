package Singleton;

public class Example {
    public static void main(String[] args) {
        Store s = Store.getInstance();
        System.out.println(s);
    }
}
