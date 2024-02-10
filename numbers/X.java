public class X {
    public static void main(String[] args) {
        int star = 5, space = 0;
        for (int i = 1; i <= 5; i++) {
            String line = "";
            for (int j = 1; j <= space; j++) {
                line += " ";
            }
            for (int j = 1; j <= star; j++) {
                line += "*";
            }
            star--;
            space++;
            System.out.println(line);
        }
    }
}
