public class New {

    New obj = new New();

    public static void main(String[] args) {
        patter(6);
    }

    public static void patter(int size) {
        for (int i = size; i >= 1; i--) {
            String line = "";
            for (int k = 0; k < size - i; k++) {
                line += " ";
            }
            for (int j = 1; j <= i; j++) {
                line += (i + " ");
            }
            System.out.println(line);
        }
    }
}
