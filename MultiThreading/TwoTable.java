public class TwoTable extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}
