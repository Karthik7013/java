public class alpha3 {
    public static void main(String[] args) {
        char ch = 'A';

        for (int i = 1; i <= 5; i++) {
            char temp = ch;
            for (int j = 1; j <= 5; j++) {
                System.out.print(temp);
                temp += 5;
            }
            ch++;
            System.out.println();

        }
    }
}
