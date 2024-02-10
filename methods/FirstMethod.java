public class FirstMethod {

    static public void main(String[] args) {
        System.out.println("number");
        one();
    }

    static public void one() {
        System.out.println("one");
        two();
    }

    static public void two() {
        System.out.println("two");
        three();
    }

    static public void three() {
        System.out.println("three");
        four();
    }

    static public void four() {
        System.out.println("four");
        five();
    }

    static public void five() {
        System.out.println("five");
    }
}