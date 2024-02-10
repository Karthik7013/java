// package interview;

class Animal {
    public void run1() {
        System.out.println("animal");
    }
}

class Cat extends Animal {
    public void run() {
        System.out.println("cat");
    };
}

public class Six extends Cat {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.run1();
    }
}
