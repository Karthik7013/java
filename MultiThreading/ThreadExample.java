// import java.lang.Thread;

public class ThreadExample extends Thread {

    public void run() {
        System.out.println("thread");
    }

    public static void main(String[] args) {

        ThreadExample t1 = new ThreadExample();
        t1.start();

        for (int i = 0; i <= 50; i++) {
            System.out.println("main");
        }

    }
}