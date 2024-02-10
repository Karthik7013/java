public class SevenTable extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + 7 * i);
        }
    }
}
