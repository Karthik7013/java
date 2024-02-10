public class star {
    public static void main(String[] args) {
        int size = 4;
        int star = 1;

        for (int i = 1; i <= size; i++) {

            int num = 1;
            for (int j = 1; j <= star; j++) {
                if (i == 1) {
                    System.out.print(num);
                } else {
                    System.out.print(num + "*");
                }
                num++;
            }
            star++;
            System.out.println();
        }
    }
}
